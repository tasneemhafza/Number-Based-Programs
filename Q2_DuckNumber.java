import java.util.Scanner;

public class Q2_DuckNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String n= sc.next();
        sc.close();
        if(n.startsWith("0")){
            System.err.println("Not a Duck Number.");
            return;
        }
        if(n.contains("0")){
            System.err.println("It is a Duck Number.");
        } else{
            System.err.println("Not a Duck Number.");
        }
    }
}
