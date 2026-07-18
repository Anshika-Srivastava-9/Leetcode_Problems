class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length; int cols=arr[0].length;
        int l=0; int hi=row*cols-1;
        while(l<=hi){
            int mid=(l+hi)/2;
            int midRow=mid/cols;
            int midCol=mid%cols;
            if(arr[midRow][midCol]==target) return true;
            else if (arr[midRow][midCol]<target) l=mid+1;
            else hi=mid-1;
        }
    return false;
    }
    }