import java.util.Scanner;

public class Q8_AbundantNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum>n){
            System.out.println("The number is an Abundand Number.");
        } else{
            System.out.println("The number is NOT an Abundand Number.");
        }
    }
}
