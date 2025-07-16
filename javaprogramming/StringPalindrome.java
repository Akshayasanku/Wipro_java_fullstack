import java.util.Scanner;
class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = sc.nextLine();
        StringBuilder c = new StringBuilder(a);
        String b = c.reverse().toString();
        System.out.println("Reverse is: "+ b);
        if (a.equals(b)) {
             System.out.println("Palindrome");} 
        else {
            System.out.println("Not Palindrome");
            }
            
        }
}
