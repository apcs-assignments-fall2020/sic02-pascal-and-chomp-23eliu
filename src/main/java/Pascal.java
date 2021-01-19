/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {   
        int[][] mat = new int[n][n];
        mat[0][0] = 1;

        for (int row = 1; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (col == 0) {
                    mat[row][col] = 1;
                }
                else {
                    mat[row][col] = mat[row-1][col] + mat[row-1][col-1];
                }
            }
        }
        return mat;
    }
}
