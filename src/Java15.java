public class Java15 {
    static void java15a(){
        float i = 3;
        boolean result = ((i %2 == 0) ? true : false);
        String k = ((result == true) ? "par" : "impar");
        System.out.println (k);
    }

    static void java15b(){
        int i = (int) (Math.random()*2);
        //boolean result = ((i == 0) ? true : false);
        //String k = ((result == true) ? "white" : "black");
        //System.out.println(i);
        //System.out.println (k);
        System.out.println((i == 0) ? "white" : "black");
    }

    public static void main(String[] args){
        //java15a();
        //java15b();
    }
}
