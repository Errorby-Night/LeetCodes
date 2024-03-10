class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i : nums1)
            list1.add(i);
        for(int i : nums2)
            list2.add(i);


        list1.retainAll(list2);
        List<Integer> noDup= new ArrayList<>();
        for(int i = 0; i < list1.size(); i++)
            if(!noDup.contains(list1.get(i)))
                noDup.add(list1.get(i));
        int[] res = new int[noDup.size()];
        for(int i = 0; i < noDup.size(); i++)
            res[i] = noDup.get(i);
        return res;
    }
}