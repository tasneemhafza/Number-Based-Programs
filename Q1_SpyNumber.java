import java.util.Scanner;

class Q1_SpyNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int sum=0, prod=1;
        if(n<10){
            System.out.println("The number is not a spy number.");
            return;
        } else{
            while(n>0){
                int r=n%10;
                sum += r;
                prod *= r;
                n= n/10;
            }
        }
        if(sum==prod){
            System.err.println("The number is a spy number.");
        } else{
            System.err.println("The number is not a spy number.");
        }

    }
}