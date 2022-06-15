/*
* Haz un ejemplo de rango circular sobre todos los tipos de numeros enteros.
- En el caso de byte, el numero debera de desbordar 5 posiciones
- En el caso de short, el numero debera de desbordar 25 posiciones
- En el caso de int, el numero debera de desbordar 10000 posiciones
- En el caso de long, el numero debera de desbordar 20000 posiciones.
*/

package java06;

public class java06 {

    public static void main(String[] args){
        byte bt = (byte) 132;
        short sh= (short) 32792;
       // int i = 2147493647;
       // long lng = 9233372036854975807;

        System.out.println(bt);
        System.out.println(sh);
       // System.out.println(i);
       // System.out.println(lng);
    }
}
