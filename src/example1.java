/* write a Java program to create a class called "person"with a name and age attribute.
create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.*/

import java.util.Scanner;

public class example1 {
       void print(String name,int age){
           System.out.println("Your name is "+name);
           System.out.println("Your age is "+age);
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.next();
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        example1 e1=new example1();
        e1.print(name,age);

    }
}
