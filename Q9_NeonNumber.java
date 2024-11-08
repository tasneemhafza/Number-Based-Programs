import java.util.Scanner;

public class Q9_NeonNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int sq= n*n;
        int sum=0;
        while(sq>0){
            int r=sq%10;
            sum += r;
            sq/=10;
        }
        if(sum==n){
            System.out.println("The number is a Neon Number.");
        } else{
            System.out.println("The number is NOT a Neon Number.");
        }
    }
}
