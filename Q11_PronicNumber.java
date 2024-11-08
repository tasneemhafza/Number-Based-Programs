import java.util.Scanner;

public class Q11_PronicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        boolean flag=false;
        for(int i=1; i<n/3; i++){
            if(i*(i+1)==n){
                flag=true;
            }
        }
        if(flag){
            System.out.println("The number is a Pronic Number.");
        } else{
            System.out.println("The number is NOT a Pronic Number.");
        }
    }
}
