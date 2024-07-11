import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int b= sc.nextInt();
        int R=1;
        for (int i=1; i<=b; i++){
            R=R*i;

        }
        System.out.println("Factorial number is: "+R);
    }
}
