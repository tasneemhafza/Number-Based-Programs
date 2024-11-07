import java.util.Scanner;

public class Q7_MagicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        sc.close();
        int ans= magicNo(n);
        if(ans==1){
            System.out.println("The number is a Magic Number.");
        } else{
            System.out.println("The number is NOT a magic number.");
        }
    }
    static int magicNo(int n){
        int sum=0;
        int num=n;
        while(num>0){
            int r=num%10;
            sum+=r;
            num/=10;
        }
        if(sum<10) return sum;
        return magicNo(sum);
    }
}
