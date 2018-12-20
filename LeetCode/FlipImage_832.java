package leetcode;

public class FlipImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {

        reverseRow(A);
        flipNumber(A);

        return A;
    }

    public void reverseRow (int[][] A) {
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[i].length / 2; j++) {
                int temp = A[i][j];

                A[i][j] = A[i][ A[i].length - j - 1 ];

                A[i][A[i].length - j - 1] = temp;
            }
        }
    }

    public void flipNumber (int[][] A) {
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[i].length; j++) {

                A[i][j] = (A[i][j] + 1) % 2;
            }
        }
    }
}
