import java.util.Scanner;
public class Evenorodd{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
          System.out.print("Enter the number: ");
          int num = scan.nextInt();
          if (num%2==0){
              System.out.print("Even");
          }
          else{
              System.out.print("Odd");
          }
          
                 }
    }
