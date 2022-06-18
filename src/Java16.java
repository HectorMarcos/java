public class Java16 {
    static void java16a() {
        int i = (int) (Math.random() * 2);
        System.out.println(i);
        if (i == 1) {
            System.out.println("RED");
        }
        //if (i == 0) {
        //   System.out.println("GREEN");
        //}
        else {
            System.out.println("GREEN");
        }
    }

    static void java16b() {
        double temp = 31.4;
        if (temp >= 20){
            System.out.println("Hot weather");
        } else if (temp >= 10) {
            System.out.println("Warm weather");
        }else {
            System.out.println("Cold weather");
        }
    }

    public static void main(String[] args) {
        //java16a();
        //java16b();
    }
}
