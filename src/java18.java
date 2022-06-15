public class java18 {
    public static void main(String[] args) {
        double height = 11;
        double with = 11;
        //double arm = with / 2;
        for (int i = 0; i < height; i++) {
            System.out.println("");
            for (int j = 0; j < with; j++) {
                System.out.print("*");
            }
            with--;
        }
    }
}
