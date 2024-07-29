public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    import java.util.Random;
import java.util.Scanner;

    public class ArrayEsercizio {
        public static void main(String[] args) {

            int[] array = new int[5];
            Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10) + 1;
            }


            System.out.println("Array iniziale:");
            stampaArray(array);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {

                    System.out.print("Inserisci un numero (0 per uscire): ");
                    int numero = scanner.nextInt();
                    if (numero == 0) {
                        break;
                    }

                    System.out.print("Inserisci la posizione (0-4): ");
                    int posizione = scanner.nextInt();


                    array[posizione] = numero;


                    System.out.println("Nuovo stato dell'array:");
                    stampaArray(array);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Errore: Posizione non valida. Riprova.");
                } catch (Exception e) {
                    System.out.println("Errore: Input non valido. Riprova.");
                    scanner.next(); // per pulire lo scanner in caso di input non valido
                }
            }

            scanner.close();
        }

        
        public static void stampaArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}