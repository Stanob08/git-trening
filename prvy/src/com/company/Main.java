package com.company;
import java.util.Scanner;
public class Main {

    static void scitaj(float cislo1, float cislo2) {
        float vysledok = cislo1 + cislo2;
        System.out.println(vysledok);
    }
    static void odcitaj(float cislo1, float cislo2) {
        float vysledok = cislo1 - cislo2;
        System.out.println(vysledok);
    }
    static void vynasob(float cislo1, float cislo2) {
        float vysledok = cislo1 * cislo2;
        System.out.println(vysledok);
    }
    static void vydel(float cislo1, float cislo2) {
        float vysledok = cislo1 / cislo2;
        System.out.println(vysledok);
    }


    public static void main(String[] args) {
        boolean a = true;
        float cislo1;
        float cislo2;

        while (a) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Zadaj operaciu, 2 cisla:");
            String operacia = scanner.nextLine();
            cislo1 = scanner.nextInt();
            cislo2 = scanner.nextInt();

            if (operacia.equals("+")) {
                scitaj(cislo1, cislo2);
            } else if (operacia.equals("-")) {
                odcitaj(cislo1, cislo2);
            } else if (operacia.equals("*")) {
                vynasob(cislo1, cislo2);
            } else if (operacia.equals("/")) {
                vydel(cislo1, cislo2);
            } else {
                System.out.println("chyba");
            }
            scanner.nextLine();
            System.out.println("Chces skoncit?");
            String ano = scanner.nextLine();
            if (ano.equals("ano")) {
                a = false;
            }

        }


    }
}

