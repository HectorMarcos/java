public class java31 {
    int i = 0;
    boolean interruptor = true;

    void arrayRunner(String[] array) {
        System.out.println(i + " " + array[i]);
        if (array[i].equals("HTML")) {
            interruptor = false;
        }
        i++;
        // Break the recursivity
        if (interruptor != false) {
            arrayRunner(array);
        }
    }

    int n1 = 0;
    int n2 = 1;
    int n3;
    boolean k = true;

    void fibonacci() {
        if (n1 == 0 && n2 == 1) {
            System.out.print(n1 + " " + n2);
        }
        n3 = n1 + n2;
        System.out.print(" " + n3);
        n1 = n2;
        n2 = n3;
        if (n3 == 55) {
            k = false;
        }
        if (k != false) {
            fibonacci();
        }
    }

    public static void main(String[] args) {
        //String[] technologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        java31 java31 = new java31();
        //java31.arrayRunner(technologies);
        java31.fibonacci();


    }
}

