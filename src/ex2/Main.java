package ex2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inițializare HashSet pentru stocarea cărților
        HashSet<Carte> setCarti = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adaugă carte în set");
            System.out.println("2. Afișare cărți");
            System.out.println("0. Ieșire");

            int optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    adaugaCarte(setCarti);
                    break;
                case 2:
                    afisareCarte(setCarti);
                    break;
                case 0:
                    System.out.println("Program încheiat.");
                    System.exit(0);
                default:
                    System.out.println("Opțiune invalidă. Încearcă din nou.");
            }
        }
    }

    private static void adaugaCarte(HashSet<Carte> setCarti) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu culoarea cărții:");
        String culoare = scanner.nextLine();

        System.out.println("Introdu simbolul cărții:");
        String simbol = scanner.nextLine();

        Carte carte = new Carte(culoare, simbol);
        setCarti.add(carte);

        System.out.println("Carte adăugată cu succes!");
    }

    private static void afisareCarte(HashSet<Carte> setCarti) {
        System.out.println("Lista de cărți:");
        for (Carte carte : setCarti) {
            System.out.println(carte);
        }
    }
}

class Carte {
    public String culoare;
    public String simbol;

    public Carte(String culoare, String simbol) {
        this.culoare = culoare;
        this.simbol = simbol;
    }

    public String toString() {
        return "Carte{" +
                "având culoarea='" + culoare + '\'' +
                ", și simbolul='" + simbol + '\'' +
                '}';
    }
}
