import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        int row=matris[0].length;
        int col=matris.length;
        int[][] transposeArray=new int[row][col];

        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                transposeArray[j][i]=matris[i][j];
            }
        }
        System.out.println("******");
        for (int i = 0; i < transposeArray.length; i++) {
            for (int j = 0; j < transposeArray[i].length; j++) {
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println();
        }


    }

}
