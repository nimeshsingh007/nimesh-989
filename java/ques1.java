import java.util.Scanner;
public class ques1{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a,b;
System.out.println("enter the first number");
a = sc.nextInt();
System.out.println("enter the second number");
b = sc.nextInt();
System.out.println("sum= "+(a+b));
System.out.println("substract "+(a-b));
System.out.println("product " +(a*b));
if(b!=0){
    System.out.println("quotient=" +((double)a/b));
} else {
System.out.println("division by zero is not possible");
}
sc.close();
    }
}
