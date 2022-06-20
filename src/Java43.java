import java.io.InputStream;
import java.util.Scanner;

class Main {
    //boolean controller;
    void exercise() {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String parameter1;
        String parameter2;
        boolean controller = true;
        System.out.print("Federico: ");
        parameter1 = sc.next();
        System.out.print("GarciaLorca: ");
        parameter2 = sc.next();

        if (parameter1.equals("Federico") && parameter2.equals("GarciaLorca")) {
            controller = true;
        } else {
            controller = false;
        }
        if (controller == true) {
            Lorca l = new Lorca();
            l.poem();
        }
        if (controller == false) {
            NotAutorized fail = new NotAutorized();
            fail.failParameter1 = parameter1;
            fail.failParameter2 = parameter2;
            fail.failMsg();
        }
    }
}

class Lorca {
    void poem() {
        System.out.println("El sueño va sobre el tiempo,");
        System.out.println("flotando como un velero,");
        System.out.println("flotando como un velero,");
        System.out.println("nadie puede abrir semillas");
        System.out.println("en el corazón del sueño,");
        System.out.println("en el corazón del sueño.");
        System.out.println(" ");
        System.out.println("El sueño va sobre el tiempo");
        System.out.println("hundido hasta los cabellos,");
        System.out.println("hundido hasta los cabellos,");
        System.out.println("ayer y mañana comen");
        System.out.println("oscuras flores de duelo,");
        System.out.println("oscuras flores de duelo.");
    }
}

class NotAutorized {
    String failParameter1;
    String failParameter2;
    void failMsg() {
        System.out.println("You entered the wrong parameters...");
        System.out.println(failParameter1);
        System.out.println(failParameter2);
    }
}

public class Java43 {
    public static void main(String[] args) {
        Main java43 = new Main();
        java43.exercise();

    }
}
