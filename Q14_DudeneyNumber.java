import java.util.Scanner;

public class Q14_DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        double cube= Math.cbrt(n);
        int sum=0, n2=n;
        while(n2>0){
            int r=n2%10;
            sum += r;
            n2/=10;
        }
        if(sum==cube){
            System.out.println("The number is a Dudeney Number.");
        } else{
            System.out.println("The number is NOT a Dudeney Number.");
        }
    }
}
