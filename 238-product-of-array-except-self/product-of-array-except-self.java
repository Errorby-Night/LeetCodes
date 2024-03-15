class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int postfix[] = new int[n];

        prefix[0] = 1;
        postfix[n - 1] = 1;
        int i = 1, j = n - 2;
        int m1 = 1, m2 = 1;
        while(i < n && j >= 0){
            m1 *= nums[i - 1];
            m2 *= nums[j + 1];
            postfix[j] = m2;
            prefix[i] = m1;
            i++;
            j--;
        }
        
        i = 0;
        int result[] = new int[n], k = 0;
        while(i < n ) {
            result[k++] = prefix[i] * postfix[i];
            i++;
        }
        return result;
    }
}