public class Exercitii_Array {

    public static void main(){
        int[] scor = {2, 3, 5, 2, 4, 8, 10, 6};

        for (int i = 0; i < scor.length; i++) {
           System.out.print(scor[i] + " ");
        }

        System.out.println();

        int suma = 0;
        for (int i = 0; i <= scor.length - 1; i++) {
            suma = suma + scor[i];
        }

        System.out.println("Suma numerelor din sir este: " + suma);


        int valMaxim = scor[0];
        for (int i = 0; i < scor.length; i++){
            if (scor[i] > valMaxim){
                valMaxim = scor[i];
            }
        }

        System.out.println("Valoarea maxima este: " + valMaxim);

        int counter = 0;
        for (int i = 0; i < scor.length; i++){
            if (scor[i] % 2 == 0){
//                counter++;
                counter = counter + 1;
            }
        }
        System.out.println("Numarul numerelor pare este: " + counter);


        System.out.println("Media numerelor este: " + suma / (scor.length -1));

    }
}
