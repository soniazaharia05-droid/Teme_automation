public class Exercitii_String {

    public static void main () {
        String text = "Ana are 7 mere verzi";

        System.out.println("Lungimea este: " + text.length());

        String cuvant = "catel";
        System.out.println("Prima litera: " + cuvant.charAt(0));
        System.out.println("Ultima litera: " + cuvant.charAt(cuvant.length() - 1));


        String text1 = "Java";
        String text2 = "Phyton";
        boolean eq = text2.equals(text1);
        System.out.println("Textele sunt egale: " + eq);

        System.out.println("Contine cuvant: " + text.contains("mere"));

        String noulText = text.replace(" ", "");
        System.out.println("Inlocuire spatii: " + noulText);

        String caise = text.replace("mere", "caise");
        System.out.println(caise);
    }
}
