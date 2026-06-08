class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int h = matrix[0].length-1;
        int r = 0;
        while(r < matrix.length-1){
            if((r < matrix.length-1) && (target > matrix[r][h])){
                r++;
            }
            else{
                break;
            }
        }
        System.out.println(r);
        while(l <= h){
            int m = (l + h)/2 ;
            if(matrix[r][m] == target){
                return true;
            }
            else if(matrix[r][m] > target){
                h = m - 1;
            }
            else{
                l = m + 1;
            }

        }
        return false;
    }
}
