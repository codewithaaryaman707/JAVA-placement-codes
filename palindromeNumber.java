import java.util.Scanner;

public class palindromeNumber{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
    
        int num = sc.nextInt();

        int org = num;

        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println(rev);


    }
}