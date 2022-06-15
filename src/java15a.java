public class java15a {
    public static void main(String[] args){
        float i = 3;
        boolean result = ((i %2 == 0) ? true : false);
        String k = ((result == true) ? "par" : "impar");
        System.out.println (k);
    }
}
