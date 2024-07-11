import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        int R,sum=0;
        while(n>0) {
            R=n%10;
            sum=sum+(R*R*R);
            n=n/10;
        }
        if(n==sum){
            System.out.println("Number is armstrong number");
        }
        else{
            System.out.println("Number is not armstrong number");
        }
    }
}
