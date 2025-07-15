import java.util.Scanner;
class Posnegzero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        if (num<0){
            System.out.println("Negative");
        }
        else if (num>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Zero");
        }
        
        
    }
}
