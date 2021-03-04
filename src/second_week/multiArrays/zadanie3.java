package src.second_week.multiArrays;

public class zadanie3 {
    public static void main(String[] args) {
        int[][][][][] array = new int[2][2][2][2][2];
        int value = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++){
                            array[i][j][k][l][m] = value;
                            value += 2;
                            System.out.print(array[i][j][k][l][m]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
