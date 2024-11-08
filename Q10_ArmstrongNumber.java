import java.util.Scanner;

public class Q10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int sum=0, n2=n;
        while(n2>0){
            int r=n2%10;
            sum += Math.pow(r, 3);
            n2/=10;
        }
        if(sum==n){
            System.out.println("The number is an Armstrong Number.");
        } else{
            System.out.println("The number is NOT an Armstrong Number.");
        }
    }
}
