import java.util.Scanner; 
public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter 2 strings");
        String s1 = sc.nextLine(); 
        String s2 = sc.nextLine();
        System.out.println(s1 + " technologies " + s2);
    }
}
