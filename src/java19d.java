public class java19d {
    public static void main(String[] args) {
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
}
