import java.util.Scanner;

public class Q5_DisariumNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String n= sc.next();
        sc.close();
        int orignum=Integer.parseInt(n);
        int num=Integer.parseInt(n);
        int l=n.length();
        double sum=0;
        while(num>0 && l>0){
            int r=num%10;
            sum += Math.pow(r, l);
            l--;
            num/=10;
        }
        if(sum==orignum){
            System.err.println("The number is a Disarium Number.");
        } else{
            System.err.println("The number is NOT a Disarium Number.");
        }
    }
}
