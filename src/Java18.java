public class Java18 {

    static void java18(){
        String star = "";
        String space = "        ";
        for (int i = 0; i < 8; i++) {
            star = "*" + star + "*";
            System.out.println(space + star);
            space = space.substring(0, space.length() - 1);
        }
        String tree = "****";
        for (int i = 0; i < 2; i++) {
            System.out.println("       " + tree);
        }
    }
    public static void main(String[] args) {
        //java18();
    }
}
