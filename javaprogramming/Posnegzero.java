import java.util.Scanner; 
public class Posnegzero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        if (num>0){
            System.out.print("Positive");
        }
        else if(num<0){
            System.out.print("Negative");
        }
        else{
            System.out.print("Zero");
        }
    }
}
