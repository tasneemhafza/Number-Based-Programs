import java.util.Scanner;

public class Q3_TechNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String n= sc.next();
        sc.close();
        int sum=0, square=0;
        if(n.length()%2 == 0){
            String a= n.substring(0, n.length()/2);
            String b= n.substring(n.length()/2, n.length());
            int first= Integer.parseInt(a);
            int second= Integer.parseInt(b);
            sum= first+second;
            square= sum*sum;
        }
        int num= Integer.parseInt(n);
        if(square==num){
            System.err.println("The number is a Tech Number.");
        } else{
            System.err.println("The number is NOT a Tech Number.");
        }
    }
}
