import java.util.*;

class Solution {
    int n;
    List<Integer> prime;
    List<List<Integer>> commonFactor;
    List<Integer> num_state;

    BitSet sieved = new BitSet(100001);

    void Sieve(int n) {
        sieved.set(0);
        sieved.set(1);
        int n_sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= n_sqrt; i++) {
            if (!sieved.get(i)) {
                for (int j = i * i; j <= n; j += i)
                    sieved.set(j);
            }
        }
        prime = new ArrayList<>();
        for (int i = 2; i <= n; i++)
            if (!sieved.get(i)) prime.add(i);
    }

    void build_commonFactor_path(List<Integer> nums, int M) {
        num_state = new ArrayList<>(Collections.nCopies(M + 1, 0));
        commonFactor = new ArrayList<>(M + 1);

        for (int i = 0; i <= M; i++)
            commonFactor.add(new ArrayList<>());

        for (int x : nums)
            num_state.set(x, 1);

        for (int p : prime) {
            if (num_state.get(p) != 1)
                num_state.set(p, -1);

            for (int i = p * 2; i <= M; i += p) {
                if (num_state.get(i) == 1) {
                    commonFactor.get(i).add(p);
                    commonFactor.get(p).add(i);
                }
            }
        }
    }

    void dfs(int i, int[] sz) {
        if (num_state.get(i) == 1 && i != 1)
            sz[0]++;
        num_state.set(i, 2);

        for (int x : commonFactor.get(i)) {
            if (num_state.get(x) == 1 || num_state.get(x) == -1) {
                dfs(x, sz);
            }
        }
    }

    public boolean canTraverseAllPairs(int[] nums) {
        if (nums.length == 1) return true;
        int M = Arrays.stream(nums).max().getAsInt();
        int sqrtM = (int) Math.sqrt(M);
        Sieve(M);
        BitSet S = new BitSet(100001);
        for (int x : nums) {
            if (x == 1) return false;
            S.set(x);
        }
        nums = Arrays.stream(nums).filter(x -> x != 0).toArray();
        List<Integer> numList = new ArrayList<>();
        for (int i = 2; i <= M; i++)
            if (S.get(i)) numList.add(i);

        int n = numList.size();

        build_commonFactor_path(numList, M);
        for (int i : numList) {
            if (num_state.get(i) == 1) {
                int[] sz = new int[1];
                dfs(i, sz);
                if (sz[0] == n) return true;
            }
        }
        return false;
    }
}
