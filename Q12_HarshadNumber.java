import java.util.Scanner;

public class Q12_HarshadNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int sum=0, n2=n;
        while(n2>0){
            int r=n2%10;
            sum += r;
            n2/=10;
        }
        if(n%sum==0){
            System.out.println("The number is a Harshad Number.");
        } else{
            System.out.println("The number is NOT a Harshad Number.");
        }
    }
}
