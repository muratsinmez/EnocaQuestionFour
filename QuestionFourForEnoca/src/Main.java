public class Main {
    public static void main(String[] args) {
        int i,k;
        int sembol=1;

        for(k=0; k<10; k++) {
            if(sembol==1||sembol%2==0)
                for (i=0; i <sembol; i++) {
                    System.out.print("*");
                }
            System.out.println("");

            sembol++;
        }
    }
}