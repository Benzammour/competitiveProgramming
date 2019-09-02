class Problem0074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        for (int[] iArr : matrix) {
            if (iArr[0] <= target && iArr[iArr.length - 1] >= target) {
                return binSearch(iArr, 0, iArr.length-1, target);
            }
        }
        
        return false;
    }
    
    public boolean binSearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target)
                return true;
            else
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
        }

        return false;
    }
}