import java.io.InputStream;
import java.util.Scanner;

public class Java42 {

    void Exercise1() {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);

        int num = 0;
        try {
            System.out.print("Enter number: ");
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a number");
        }
        String chr = "";
        try{
            System.out.print("Enter char: ");
            chr = sc.next(); //FIXME cuando el trycatch anterior falla se salta este y pasa directamente al siguiente
        } catch (Exception e){
            System.out.println("That's not text");
        }
        boolean bl = false;
        try{
            System.out.print("Enter boolean: ");
            bl = sc.nextBoolean();
        }catch (Exception e){
            System.out.println("That's not boolean");
        }

        System.out.println(num);
        System.out.println(chr);
        System.out.println(bl);
    }

    //TODO preguntar si se pueden hacer el trycatch sin necesidad de declarar las variables fuera de el de modo que se inicialicen dentro del try pero puedan ser usadas fuera del mismo

    void Exercise2(){
        try {
            int i = 5 / 0;
            throw new RuntimeException("Dividing between 0");
        }catch (Exception e){
            System.out.println("TONTO");
        }
    }
    public static void main(String[] args) {
        Java42 Java42 = new Java42();
        //Java42.Exercise1();
        Java42.Exercise2();
    }
}
