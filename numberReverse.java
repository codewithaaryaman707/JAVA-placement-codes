import java.util.Scanner;

public class numberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int org =n;
        int rev = 0;
        while(org!=0) {
            rev = rev*10 + org%10;
            org = org/10;

        }
        System.out.println(rev);
    }
}
