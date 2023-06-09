import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1: ");
        float s1 = sc.nextFloat();
        System.out.print("enter number 2: ");
        float s2 = sc.nextFloat();
        System.out.print("enter number 3: ");
        float s3 = sc.nextFloat();
        float total = s1+s2+s3;
        float percentage = total*100/300;
        System.out.print("your total is: "+total);
        System.out.print("\nyour percentage is: "+percentage);
    }
}
