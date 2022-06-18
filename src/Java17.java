public class Java17 {
    static void java17a() {
        int num = 9;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }
    }
    static void java17b() {
        double num = 0;
        System.out.println((num == 0) ? "It's zero!" : (num > 0 ? "It's positive!" : "It's negative"));
    }
    public static void main(String[] args) {
        //java17a();
        //java17b();
    }
}
