import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int n = sc.nextInt();
        int n1=0,n2=1,n3;
        for (int i=0;i<=n;i++) {
            System.out.println(n1);
            n3=n2+n1;
            n1=n2;
            n2=n3;
        }
    }
}