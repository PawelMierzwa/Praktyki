package second_week.loops;

public class zadanie3 {
    public static void main(String[] args) {
        for ( int i = 1; i < 11; i++){
            System.out.println(i + "przejscie petli");
            for (int j =1; j< 11; j++){
                if (i*j %2 == 0){
                    System.out.println(" [i:" + i + "]" + "[j:" + j + "]\t" + i + "*" + j +"=" + i*j);
                } else {
                    System.out.println(" [i:" + i + "]" + "[j:" + j + "]\t" + i + "*" + j + "= x");
                }
            }
       }
    }
}
