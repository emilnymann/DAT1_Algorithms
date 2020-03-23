import timer.MyTimer;

public class Kompliceret {

    public static void main(String[] args) {


        int n = 20;
        int counter = 0;
        long resultat = 0;

        // Denne algoritme tager meget lang tid at gennemføre, og har en algoritmisk kompleksitet på O(N^2)
        for (int i = 10; i < n + 10; i++) {
            MyTimer.start();

            counter++;

            for (int j = 0; j < counter; j++) {
                System.out.print(".");
            }

            for (int j = 1; j <= Math.pow(3, i); j++) {
                resultat = i;
            }

            System.out.print(" ");
            MyTimer.stop();
        }

        System.out.println("Resultat " + resultat);

    }
}
