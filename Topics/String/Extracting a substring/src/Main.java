import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine();
        int beg = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(word.substring(beg,end+1));
    }
}