import java.util.Scanner;
class StringRep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string a: ");
        String a = sc.nextLine();
        StringBuilder c = new StringBuilder(a);
        int n=c.length();
        for(int i=0;i<=n;i++){
            System.out.print(c.substring(0,2));
            
        }
        
    }
}
