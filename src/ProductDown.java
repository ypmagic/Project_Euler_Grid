/**
 * Created by young on 5/16/17.
 */
public class ProductDown {

    private int[][] array;

    public ProductDown(int[][] array) {
        this.array = array;
    }

    public int calculateHighestProduct() {
        int highestProduct = 0;
        for (int j = 0; j < this.array.length; j++) {
            for (int i = 0; i < this.array[i].length-4; i++) {
                int temp = this.array[i][j] * this.array[i+1][j] * this.array[i+2][j] * this.array[i+3][j];
                if (temp > highestProduct) {
                    highestProduct = temp;
                }
            }
        }
        return highestProduct;
    }
}
