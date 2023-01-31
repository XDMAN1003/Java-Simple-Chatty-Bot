import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = scanner.nextInt();
        int big = 0;
        int suitable = 0;
        int small = 0;
        for(int i=0; i< count; i++){
            int num = scanner.nextInt();
            if(num == 1){
                big +=1;
            } else if (num == 0) {
                suitable +=1;
            }
            else{
                small +=1;
            }
        }
        System.out.println(suitable + " "+ big+ " "+ small);
    }
}
