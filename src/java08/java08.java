/*
Basándote en el ejercicio anterior en el que hemos declarado una variable para cada tipo primitivo transforma dichas variables a constantes y mostrar por pantalla.
Salida:
true
C
10
20
30
10000000
10.5
2.000000000052E10
*/

package java08;

public class java08 {
    private static byte bt;

    public static void main(String[] args) {
        final boolean bol = false; //
        final char xar = 'C';
        final byte bt = 10;
        final short sh = 20;
        final int i = 30;
        final long lng = 10000000;
        final float flt = 10.5F;
        final double dbl = 2.000000000052E10;

        System.out.println(bol);
        System.out.println(xar);
        System.out.println(bt);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dbl);
    }
}
