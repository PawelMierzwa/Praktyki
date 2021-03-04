package src.second_week.multiArrays;

public class zadanie2 {
    public static void main(String[] args) {
        int[][][][] array = new int[3][3][3][3];
        int value = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++){
                    for (int l = 0; l < 3; l++){
                        array[i][j][k][l] = value;
                        value +=3;
                        System.out.print(array[i][j][k][l]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
