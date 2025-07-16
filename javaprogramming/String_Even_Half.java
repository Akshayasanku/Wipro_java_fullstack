import java.util.Scanner;
class String_Even_Half{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string a: ");
        String a = sc.nextLine();
        StringBuilder c = new StringBuilder(a);
        if (a.length() % 2 == 0){
            System.out.println(a.substring(0, a.length()/2));
        }
        else{
            System.out.println("null");
        }
        
    }
}
