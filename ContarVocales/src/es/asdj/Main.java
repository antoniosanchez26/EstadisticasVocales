package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int contadorDeA = 0;
        int contadorDeE = 0;
        int contadorDeI = 0;
        int contadorDeO = 0;
        int contadorDeU = 0;

        System.out.println("Escribe una frase: ");
        texto = entrada.nextLine();
        System.out.println();

        System.out.println("Estadísticas: ");

        for (int i = 0; i < texto.length(); i++) {
            switch(texto.charAt(i)) {
                case 'a':
                case 'A':
                case 'á':
                case 'Á':
                    contadorDeA++;
                    break;
                case 'e':
                case 'E':
                case 'é':
                case 'É':
                    contadorDeE++;
                    break;
                case 'i':
                case 'I':
                case 'í':
                case 'Í':
                    contadorDeI++;
                    break;
                case 'o':
                case 'O':
                case 'ó':
                case 'Ó':
                    contadorDeO++;
                    break;
                case 'u':
                case 'U':
                case 'ú':
                case 'Ú':
                    contadorDeU++;
                    break;
            }
        }
        System.out.println("- Número de a: " + contadorDeA);
        System.out.println("- Número de e: " + contadorDeE);
        System.out.println("- Número de i: " + contadorDeI);
        System.out.println("- Número de o: " + contadorDeO);
        System.out.println("- Número de u: " + contadorDeU);
    }
}
