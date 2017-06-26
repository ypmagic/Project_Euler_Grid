/**
 * Created by young on 5/16/17.
 */
public class ProductDiagonalRight {

    private int[][] array;

    public ProductDiagonalRight (int[][] array) {
        this.array = array;
    }

    public int calculateHighestProduct () {
        int highestProduct = 0;
        for (int i = 3; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length-4; j++) {
                int temp = this.array[i][j] * this.array[i-1][j+1] * this.array[i-2][j+2] * this.array[i-3][j+3];
                if (temp > highestProduct) {
                    highestProduct = temp;
                }
            }
        }
        return highestProduct;
    }
}
