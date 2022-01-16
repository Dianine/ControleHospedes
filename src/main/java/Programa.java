import Entidade.Hospede;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hospede[] vect = new Hospede[10];

        System.out.println("Quantos quartos serão alugados? ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println();
            System.out.println("Hospede #" + i + ": ");
            System.out.print("Nome : ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Emai-l: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Hospede(nome, email);
        }
        System.out.println();
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);

            }

        }

        sc.close();


    }
}