public class java21 {
    static void javaOrNull(String str) {
        System.out.println(str == "java" ? "java" : "null");
    }

    static void login(String usr, String psw) {
        System.out.println(usr != "admin" ? "Login false" : (psw != "1234") ? "Login false" : "Login true");
    }

    static void evenOrOdd(int n){
        System.out.println(n % 2 == 0 ?"Even" : "Odd");
    }

    public static void main(String[] args) {
        javaOrNull("jva");
        login("admin","1234");
        evenOrOdd(3);
    }
}