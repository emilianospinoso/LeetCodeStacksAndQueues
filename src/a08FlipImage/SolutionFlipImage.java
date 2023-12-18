package a08FlipImage;

public class SolutionFlipImage {
    public static void main(String[] args) {
        /*
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
        For example, inverting [0,1,1] results in [1,0,0].
         */
        int[][] imagen = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        printMatrix(imagen);
        flipAndInvertImage(imagen);
        System.out.println("--------------------------------");
        printMatrix(imagen);
    }

    private static void printMatrix(int[][] imagen) {
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen.length; j++) {
                System.out.print(imagen[i][j]);
            }
            System.out.println("");
        }
    }


    static int[][] flipAndInvertImage(int[][] image) {
        int tam = image.length;
        int[][] image2 = new int[tam][tam];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
              image2[i][j]=image[i][image.length-j-1];
            }
        }
       //This is the invertion.
        for (int i = 0; i < image2.length; i++) {
            for (int j = 0; j < image2.length; j++) {
                if (image2[i][j] == 1) {
                    image2[i][j] = 0;
                } else {
                    image2[i][j] = 1;
                }
            }
        }
        return image2;
    }
}
