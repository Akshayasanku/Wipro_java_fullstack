import java.util.Scanner;
class Concatinating2strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string a: ");
        String a = sc.nextLine();
        System.out.print("Enter the string b: ");
        String b = sc.nextLine();
        StringBuilder c = new StringBuilder(a);
        c.append(b);
        String s = c.toString().toLowerCase();
        System.out.println(s);
            
        }
}
