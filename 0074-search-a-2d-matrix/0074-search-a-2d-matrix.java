class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        int st=0,end=m*n -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int mid_ele = matrix[mid/n][mid%n];
            if(target==mid_ele) return true;
            else if(target>mid_ele){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}