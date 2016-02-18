import java.util.Arrays;

class Matrix{
  public int[][] createMatrix(int rowCount,int colCount){
    return new int[rowCount][colCount];
  }

  public int[][] initializeMatrix(int[][] matrix,int value){
    for(int row=0;row<matrix.length;row++){
      for(int column=0;column<matrix[0].length;column++){
        matrix[row][column] = value++;
      }
    }
    return matrix;
  }

  public int[][] addTwoMatrices(int[][] firstMatrix,int[][] secondMatrix){
    int[][] addedMatrix = new int[firstMatrix.length][secondMatrix.length];

    for(int i=0;i<firstMatrix.length;i++){
      for(int j=0;j<secondMatrix.length;j++){
        addedMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
      }
    }
    return addedMatrix;
  }
}
