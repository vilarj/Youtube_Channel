/**
 Escribe un programa que imprima uno de los siguientes patrones:

 i)
 **********
 **********
 **********
 **********

 ii)
 *
 **
 ***
 ****
 *****

 iii)
 *
 ***
 *****
 *******
 *********
 */

public class For_Loop {
    public static void main(String[] args) {
        String objeto = "*";

        for (int k = 5; k > 0; k--) { // i = 0 | proceso | actualizas
            System.out.println(objeto);
            objeto += "*"; // objeto = objeto + "*" <-> objeto += "*"
        }
    }
}
