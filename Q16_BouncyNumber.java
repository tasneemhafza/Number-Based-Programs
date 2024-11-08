import java.util.Scanner;

public class Q16_BouncyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String n= sc.next();
        sc.close();
        boolean flag=false;
        for(int i=0; i<n.length()-2; i++){
            if((n.charAt(i)<n.charAt(i+1) && n.charAt(i+1)>n.charAt(i+2)) || (n.charAt(i)>n.charAt(i+1) && n.charAt(i+1)<n.charAt(i+2))){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("The number is a Bouncy Number.");
        } else{
            System.out.println("The number is NOT a Bouncy Number.");
        }
        
    }
}
