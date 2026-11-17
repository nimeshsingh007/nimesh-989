import java.util.Scanner;
public class ques3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius");
        double radius= sc.nextDouble();
        double area = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("area of circle is: "+area);
        System.out.println("circumference of circle is: "+circumference);
    }
}
