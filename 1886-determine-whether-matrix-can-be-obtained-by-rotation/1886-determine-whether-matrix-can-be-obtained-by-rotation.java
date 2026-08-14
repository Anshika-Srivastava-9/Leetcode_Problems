class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {

            if (equal(mat, target)) {
                return true;
            }

            mat = rotate(mat);
        }

        return false;
    }

    public boolean equal(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] rotate(int[][] mat) {

        int n = mat.length;

        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                ans[j][n - i - 1] = mat[i][j];

            }
        }

        return ans;
    }
}