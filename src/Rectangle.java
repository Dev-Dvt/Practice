import java.util.Scanner;

/* Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */
public class Rectangle{
    void display(float width, float height){
        System.out.println("Area of the Rectangle is " +width*height);
        System.out.println("Perimeter of the rectangle is " +(width+height)*2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre Width: ");
        int w= sc.nextInt();
        System.out.println("Enter Height");
        int h= sc.nextInt();
        Rectangle r1=new Rectangle();
        r1.display(w,h);
    }
}
