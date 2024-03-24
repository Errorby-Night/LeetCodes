class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lastm = matrix.length, lastn = matrix[0].length;

        int start = 0, end = lastm * lastn - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(matrix[mid/lastn][mid%lastn] == target)
                return true;
            else if(matrix[mid/lastn][mid%lastn] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}