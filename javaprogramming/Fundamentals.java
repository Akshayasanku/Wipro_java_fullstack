import java.util.Scanner;
public class Lastdigit {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
          System.out.print("Enter the first number: ");
          int num1 = scan.nextInt();
          System.out.print("Enter the second number: ");
          int num2 = scan.nextInt();
          int a = num1%10;
          int b = num2%10;
          if(a == b){
              System.out.print("TRUE");
          }
          else{
              System.out.print("FALSE");       }
    }
}
