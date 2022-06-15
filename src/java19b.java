public class java19b {
    public static void main(String[] args) {
        int[] arr = {30, 35, 21};
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]%3 == 0){
                System.out.println(arr[i]+" It's even");
            }
            //System.out.println(arr[i]);
            //System.out.println(arr[i] % 3 == 0 ? "It's even" : "It's odd");
        }
    }
}
