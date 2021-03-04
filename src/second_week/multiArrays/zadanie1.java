package src.second_week.multiArrays;

public class zadanie1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int value = 0;
        for (int i = 0; i < 5; i++ ){
            for (int j = 0; j <5; j++){
                array[i][j] = value;
                value +=5;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
