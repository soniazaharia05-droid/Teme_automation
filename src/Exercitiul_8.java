public class Exercitiul_8 {
    public static void main (String []args) {
        double pretInitial = 120;
        double discount = 0;

        if (pretInitial > 100) {
            discount = pretInitial * 10/100;
            System.out.println("Discount: " + discount);
        }

        System.out.println(pretInitial - discount);

    }
}
