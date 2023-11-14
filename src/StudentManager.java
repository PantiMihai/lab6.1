import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        // Inițializare ArrayList pentru stocarea studenților
        ArrayList<Student> listaStudenti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adaugă student");
            System.out.println("2. Accesează lista de studenți");
            System.out.println("3. Șterge student");
            System.out.println("0. Ieșire");

            int optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    adaugaStudent(listaStudenti);
                    break;
                case 2:
                    afiseazaLista(listaStudenti);
                    break;
                case 3:
                    stergeStudent(listaStudenti);
                    break;
                case 0:
                    System.out.println("Program încheiat.");
                    System.exit(0);
                default:
                    System.out.println("Opțiune invalidă. Încearcă din nou.");
            }
        }
    }

    private static void adaugaStudent(ArrayList<Student> listaStudenti) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numele studentului:");
        String nume = scanner.nextLine();

        System.out.println("Introdu varsta studentului:");
        int varsta = scanner.nextInt();

        Student student = new Student(nume, varsta);
        listaStudenti.add(student);

        System.out.println("Student adăugat cu succes!");
    }

    private static void afiseazaLista(ArrayList<Student> listaStudenti) {
        System.out.println("Lista de studenți:");
        for (Student student : listaStudenti) {
            System.out.println(student);
        }
    }

    private static void stergeStudent(ArrayList<Student> listaStudenti) {
        Scanner scanner = new Scanner(System.in);

        afiseazaLista(listaStudenti);

        System.out.println("Introdu indicele studentului pe care vrei să-l ștergi:");
        int index = scanner.nextInt();

        if (index >= 0 && index < listaStudenti.size()) {
            listaStudenti.remove(index);
            System.out.println("Student șters");
        } else {
            System.out.println("index invalid. Încearcă din nou.");
        }
    }
}

 class Student {
    public String nume;
    public int varsta;

    public Student(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
