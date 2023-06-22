package Objects;

public class Matrix {
    public Matrix() {

    }
    public Matrix(int[][] m) {
        matrix = m;
        rows = m.length;
        columns = m[0].length;
    }
    // Блок переменных
    public int[][] matrix;
    public int rows;
    public int columns;
    // Блок методов
    public int[][] sumMatrix(int[][] addMatrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = addMatrix[i][j] + matrix[i][j];
            }
        }
        return matrix;
    }
    public int[][] multNumMatrix(int num) {;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = num * matrix[i][j];
            }
        }
        return matrix;
    }
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
