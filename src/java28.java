public class java28 {
    static void java28a(){
        System.out.printf("%S\t%S %S\n","name","surname1","surname2");
    }
    static void java28b(){
        System.out.printf("%S\t%s%s\n","name","surname1","surname2");
    }
    static void java28c(){
        System.out.printf("%3$s, %2$s, %1$s","Name","surname1","surname2");
    }

    static void java28d(){
        System.out.printf("%10s%n",22);
    }

    static void java28e(){
        System.out.printf("%010d%n",22);
    }

    static void java28f(){
        System.out.printf("%010.2f%n",17.1829327);
    }

    static void java28g(){
        System.out.printf("%s%s","Hello \b","Wor\bld");
    }

    public static void main(String[] args) {
        java28g();
    }
}
