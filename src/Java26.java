public class Java26 {
    static void java62a() {
        Long LongVar = 5L;
        byte byteVar = 6;
        short shortVar = 7;
        Integer IntVar = 8;
        System.out.print(LongVar.getClass().getName());
        System.out.println(" "+LongVar.longValue());
        System.out.print(((Object)byteVar).getClass().getName());
        System.out.println(" "+((Object)byteVar).toString());
        System.out.print(((Object)shortVar).getClass().getName());
        System.out.println(" "+((Object)shortVar).toString());
        System.out.print(IntVar.getClass().getName());
        System.out.println(" "+IntVar.intValue());
    }

    /*
    static void java26b(String cls) {
        if (cls == String.class) {
            System.out.println("String");
        }
        else if (cls == int.class) {
            System.out.println("int");
        }
    }
    */

    public static void main(String[] args) {
        //java62a();
        //java26b("dfgdg");

    }
}
