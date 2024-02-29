import java.io.IOException;
public class Ex_1 {
    public static void main(String[]args) throws IOException {
        System.out.println("olá, mundo!");
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // incementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // dá a ch o valor Z
        System.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooLeano = " + tipoBooleano);

        // Demonsta seguência de escape em string.
        System.out.println("\nFirst\nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        // palavras reservadas do java - laranja - vocabulario
        // /t - tab \n quebra de linha \n\n salta uma linha

        //Demonstrar valores booleanos
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        //um valor booleano pode controlar a instrução if
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is" + (10 > 9));

        //Demonstra o escopo de bloco.
        int m; // conhecida pelo código dentro de main()
        m = 10;
        if(m == 10) { // inicia novo escopo
            int n = 20; // conhecido apenas nesse bloco
            // tanto m quanto n são é conhecidos aqui.
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
        //
}
