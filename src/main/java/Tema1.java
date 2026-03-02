public class Tema1 {
    public static void main() {

        // 1. Creează variabile pentru: varsta unui student, inaltimea acestuia, daca este prezent la curs. Afiseaza datele prin mesaje/propozitii.

        int varstaStudent = 21;
        double inaltimeStudent = 1.72;
        boolean estePrezent = true;

        System.out.println("1.Studentul are " + varstaStudent + " ani.");
        System.out.println("Inaltimea studentului este " + inaltimeStudent + " m.");
        System.out.println("Este prezent la curs: " + estePrezent);

        System.out.println();

        // 2. Creează doua variabile int si una double. Calculeaza suma celor doua valori int. Calculeaza media dintre toate 3.

        int a = 10;
        int b = 20;
        double c = 30.5;
        int sumaInt = a + b;
        double media3 = (a + b + c) / 3;

        System.out.println("2.Suma celor doua int este: " + sumaInt);
        System.out.println("Media celor 3 numere este: " + media3);

        System.out.println();

        // 3. Creeaza o variabila pentru varsta. Dacă persoana are 18 sau mai mult, afișează: “Acces permis”, altfel “Acces interzis”.

        int varsta = 17;
        if (varsta >= 18) {
            System.out.println("Acces permis");

        } else {
            System.out.println("3.Acces interzis");
        }

            System.out.println();

        // 4. Calculeaza suma numerelor de la 20 la 50.

        int suma = 0;
        for (int i = 20; i <= 50; i++) {
            suma = suma + i;
        }

        System.out.println("4.Suma numerelor de la 20 la 50 este: " + suma);

        System.out.println();

        // 5. Afișează numerele de la 10 la 1 folosind while.

        int i = 10;
        while (i >= 1) {

            System.out.println(i);
            i--;
        }

        System.out.println();

        // 6. Creează o metodă care afișează: “Invat Java!”

        afiseazaMesaj();

        System.out.println();

        // 7. Creeaza o metoda cu 2 parametrii int, care returneaza produsul celor doi parametrii.

        int rezultatProdus = produs(4, 5);

        System.out.println("7.Produsul este: " + rezultatProdus);

        System.out.println();

        // 8. Calculează suma numerelor pare de la 1 la 50. Crează o metoda care returneaza rezultatul.

        int sumaPare = sumaNumerelorPare();

        System.out.println("8.Suma numerelor pare este: " + sumaPare);

        System.out.println();

        // 9. Creeaza o metoda cu 3 parametrii. Returneaza media celor trei parametrii.

        double media = mediaTreiNumere(10, 20, 30);

        System.out.println("9.Media celor trei numere este: " + media);

        System.out.println();

        // 10. Creeaza o metoda care primeste 2 parametrii: start si end. Afiseaza toate numerele cuprinse intre aceste doua numere

        afiseazaInterval(5, 15);
    }

    public static void afiseazaMesaj() {
        System.out.println("6.Invat Java!");
    }

    public static int produs(int x, int y) {
        return x * y;
    }

    public static int sumaNumerelorPare() {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    public static double mediaTreiNumere(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void afiseazaInterval(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
