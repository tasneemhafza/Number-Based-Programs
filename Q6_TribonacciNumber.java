import java.util.Scanner;

public class Q6_TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        int n= sc.nextInt();
        sc.close();
        int[] arr= new int[n];
        arr[0]= 0;
        arr[1]=1;
        arr[2]= 1;
        for(int i=3; i<n; i++){
            arr[i]= arr[i-1] + arr[i-2] + arr[i-3];
        }
        System.out.print("The series is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
