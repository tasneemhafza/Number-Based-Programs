import java.util.Scanner;

public class Q4_BuzzNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String n= sc.next();
        sc.close(); 
        if(n.endsWith("7")){
            System.err.println("The number is a Buzz Number.");
            return;
        }
        int num= Integer.parseInt(n);
        if(num%7==0){
            System.out.println("The number is a Buzz Number.");
        } else{
            System.out.println("The number is NOT a Buzz Number.");
        }
    }
}
