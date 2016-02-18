import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class MatrixTest{
  Matrix matrix;
  @Before
  public void beforeEach(){
    this.matrix = new Matrix();
  }

  @Test
  public void createMatrix(){
    int[][] newMatrix = this.matrix.createMatrix(3,3);
    assertEquals(newMatrix.length,3);
    assertEquals(newMatrix[0].length,3);
  }

  @Test
  public void initializeMatrix(){
    int[][] newMatrix = this.matrix.createMatrix(3,3);
    int [][] initializedMatrix = this.matrix.initializeMatrix(newMatrix,10);
    assertEquals(initializedMatrix[0][0],10);
  }

  @Test
  public void addTwoMatrices(){
    int[][] firstMatrix = this.matrix.createMatrix(3,3);
    int[][] secondMatrix = this.matrix.createMatrix(3,3);
    int [][] initializedFirstMatrix = this.matrix.initializeMatrix(firstMatrix,1);
    int [][] initializedSecondMatrix = this.matrix.initializeMatrix(secondMatrix,2);
    int[][] additionOfMatrix = this.matrix.addTwoMatrices(initializedFirstMatrix,initializedSecondMatrix);
    assertEquals(additionOfMatrix[0][0],3);
    assertEquals(additionOfMatrix.length,3);
  }
}
