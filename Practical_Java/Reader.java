import java.util.Scanner; // importing the needed classes

public class Reader{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // a scanner object
        
        int a = scan.nextInt();
        String name = scan.next();
        double c = scan.nextDouble();
        scan.close();

        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
    }
}