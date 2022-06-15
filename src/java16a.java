public class java16a {
    public static void main(String[] args) {
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
}
