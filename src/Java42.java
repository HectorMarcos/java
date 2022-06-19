import java.io.InputStream;
import java.util.Scanner;

public class Java42 {

    void Exercise1() {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);

        boolean controller = true;
        String chr = null;
        Integer num = null;
        boolean bl = false;

        try {
            System.out.print("Enter number: ");
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a number");
            controller = false;
        }

        if (controller) {
            try {
                System.out.print("Enter char: ");
                chr = sc.next();
            } catch (Exception e) {
                System.out.println("That's not text");
                controller = false;
            }
        }
        if (controller) {
            try {
                System.out.print("Enter boolean: ");
                bl = sc.nextBoolean();
            } catch (Exception e) {
                System.out.println("That's not boolean");
                controller = false;
            }
        }
        if (controller) {
            System.out.println(num);
            System.out.println(chr);
            System.out.println(bl);
        }
        if (!controller) {
            System.out.println("You mees up, try again please");
        }
    }

    void Exercise2() {
        try {
            int i = 5 / 0;
            throw new RuntimeException("Dividing between 0");
        } catch (Exception e) {
            System.out.println("TONTO");
        }
    }

    public static void main(String[] args) {
        Java42 Java42 = new Java42();
        Java42.Exercise1();
        //Java42.Exercise2();
    }
}
