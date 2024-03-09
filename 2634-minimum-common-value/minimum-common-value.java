class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0)
            return -1;
        int i = 0,  j = 0;
        int min = Integer.MAX_VALUE;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                min = Math.min(nums1[i], min);
                break;
            }
            else if(nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        if(min == Integer.MAX_VALUE)
            return -1;
        return min;
    }
}