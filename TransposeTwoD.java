public class TransposeTwoD {
    
        // Function to transpose a 2D array
        public static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] transposed = new int[cols][rows];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposed[j][i] = matrix[i][j];
                }
            }
            
            return transposed;
        }
        
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            int[][] transposedMatrix = transposeMatrix(matrix);
            
            System.out.println("Original Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("Transposed Matrix:");
            for (int i = 0; i < transposedMatrix.length; i++) {
                for (int j = 0; j < transposedMatrix[0].length; j++) {
                    System.out.print(transposedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    

