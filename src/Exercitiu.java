public class Exercitiu {

    public static void main (String [] args){

//        //operatori matematici
//        System.out.println(11 % 3);
//
//        // 11 / 3 = 3.2
//
//
//        System.out.println(3037 % 15);
//
//        System.out.println(15 + 9);
//        System.out.println(15 * 9);
//        System.out.println(15 - 9);
//        System.out.println(15 * 9);
//        System.out.println(15.2 / 9);
//        System.out.println(15 / 9.0);
//
//        double x = 8;
//
//        System.out.println(17 / x);


        //operatori logici ==; ||; &&



        // == comparatie
        // = asignare

        double y = 15.2654;
        int z = 15;


        if ( y == z) {
            System.out.println("adevarat");
        }    else {
                System.out.println("fals");

        }

        // || sau logic
        // true || => true
        // true || false => true
        // false || false => false

        boolean ciocolata = true;
        boolean capsuni = false;

        if (ciocolata || capsuni) {
            System.out.println("imi cumpar inghetata");
        }  else {
            System.out.println("nu imi cumpar inghetata");
        }

        // && si logic

        if (ciocolata && capsuni) {
            System.out.println("astazi mananc ingetata");
        } else {
            System.out.println("astazi mananc prajitura");
        }


    }

}
