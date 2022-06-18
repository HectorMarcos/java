import java.io.InputStream;
import java.util.Scanner;

public class Java40 {

    void test() {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter char: ");
        String chr = sc.next();
        System.out.print("Enter boolean: ");
        boolean bl = sc.nextBoolean();
        System.out.println(num);
        System.out.println(chr);
        System.out.println(bl);

    }

    public static void main(String[] args) {
        Java40 Java40 = new Java40();
        Java40.test();
    }
}
