import java.util.Scanner;

public class que2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length");
    double length =sc.nextDouble();
    System.out.println("enter the breadth ");
    double breadth =sc.nextDouble();
    double area = length*breadth;
    double perimeter = 2*(length + breadth);
    System.out.println("Area: "+area);
    System.out.println("perimeter "+perimeter);


}
    
}
