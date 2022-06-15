public class java19c {
    public static void main(String[] args) {
        int num = 3;
        for (int i = 0; i < num; i++) {
            int j = (int) (Math.random()*2);
            System.out.println("Hello there!");
            while (j == 1){
                System.out.println("Hello there! From the loop!");
            }
        }
    }
}
