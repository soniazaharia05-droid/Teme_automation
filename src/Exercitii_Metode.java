public class Exercitii_Metode {

    static void inmultire(int n){
        for(int i = 1; i <= n; i++) {
            System.out.println(i * 7);
        }
    }

    static void multiplu (int nr) {
        for(int i = 100; i <= 1000; i++) {
            if (i % nr == 0){
                System.out.println(i);
                break;
            }
        }
    }

    static String numeVarsta (String nume, int varsta){
        return nume + " are " + varsta + " de ani";
    }

    static int plus (int x, int y){
        return x + y;
    }

    static int minus (int x, int y){
        return x - y;
    }

    static void interval(int limitaInferioara, int limitaSuperioara){
        for (int i = limitaInferioara; i <= limitaSuperioara; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    static void factorial (int s) {
        int inmultire = 1;
        for (int i = 1; i <= s; i++){
            inmultire = inmultire * i;
        }

        System.out.println(inmultire);
    }


    public static void main() {
        factorial(9);
    }
}
