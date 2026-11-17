import java.util.Scanner;
public class ques5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price,quantity,total;
        System.out.println("enter price of the item ");
        price = sc.nextDouble();
        System.out.println("enter the quantity ");
        quantity = sc.nextInt();
        total = price*quantity;
        System.out.printf("total bill: %.2f",total);
        sc.close();
    }
}