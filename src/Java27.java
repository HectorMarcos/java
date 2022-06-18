public class Java27 {
    static void doubleToByte(){
        double i = 50;
        byte j = (byte) i;
    }

    static void byteToDouble(){
        byte i = 50;
        double j = i;
    }

    static void byte100(){
        byte i = 100;
        byte j = (byte) (i * 2);
        System.out.println(j);
    }

    public static void main(String[] args) {
    }
}
