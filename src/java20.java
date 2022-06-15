public class java20 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3){
                System.out.println("OUT!");
                break;
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("Iteration: " + i);
            if (i == 5) {
                System.out.println("OUT!");
                break;
            }
        }
    }
}
