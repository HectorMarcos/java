public class Java19 {
    static void java19a() {
        int num = 6;
        System.out.println(num % 2 == 0 ? "It's even" : "It's odd");
    }

    static void java19b() {
        int[] arr = {30, 35, 21};
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]%3 == 0){
                System.out.println(arr[i]+" It's even");
            }
            //System.out.println(arr[i]);
            //System.out.println(arr[i] % 3 == 0 ? "It's even" : "It's odd");
        }
    }

    static void java19c() {
        int num = 3;
        for (int i = 0; i < num; i++) {
            int j = (int) (Math.random()*2);
            System.out.println("Hello there!");
            while (j == 1){
                System.out.println("Hello there! From the loop!");
            }
        }
    }

    static void java19d() {
        String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] cba = new String[abc.length];
        int j = abc.length;
        for (int i = 0; i < abc.length; i++) {
            cba[j - 1] = abc[i];
            j--;
        }
        for (int i = 0; i < cba.length; i++) {
            System.out.print(cba[i]);
        }
        System.out.println("");
        for (int i = 0; i < cba.length; i++) {
            int n = cba.length -1;
            System.arraycopy(cba,1,cba, 0,n);
            cba[n] = "";
            for (int k = 0; k < cba.length; k++) {
                System.out.print(cba[k]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //java19a();
        //java19b();
        //java19c();
        //java19d();
    }
}