public class java20 {

    static void java20(){
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
    public static void main(String[] args){
        //java20();
    }
}
