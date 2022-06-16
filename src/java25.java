public class java25 {
    static void byteTable() {
        long start = System.currentTimeMillis();
        long finish;
        Long noPrimitivo = 0L;
        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            noPrimitivo += i;
        }
        finish = System.currentTimeMillis();
        System.out.println("Rango byte desde: "+ (finish - start) +"ms");
    }

    static void tablePaint(String obj, String firstValue, String lastValue){
        System.out.println("Rango "+obj+" desde: "+firstValue+" hasta: "+lastValue);
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        tablePaint("byte", "-128", "127");
    }



}
