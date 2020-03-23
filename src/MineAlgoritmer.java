import timer.MyTimer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class MineAlgoritmer {

    static ArrayList<Integer> data = new ArrayList<>();

    public static void main(String[] args) {

        // generer data
        for (int i = 0; i < 10; i++) {
            int rnd = ThreadLocalRandom.current().nextInt(0, 50 + 1);
            data.add(rnd);
        }

        // sorter data
        Collections.sort(data);

        // foretag søgning efter tallet på index 7 (lidt snyd, men jeg genererer jo tilfældige data...)
        binarySearch(data.get(7));
    }

    static int binarySearch(int x) {
        int result;
        int indexMin = 0;
        int indexMax = data.size() - 1;

        System.out.println("Performing binary search for the integer " + x + " on a list with " + data.size() + " entries.");
        MyTimer.start();

        while (true) {
            int indexMid = (indexMax + indexMin) / 2;
            System.out.println("Looking at median index " + indexMid + "...");
            if (data.get(indexMid) == x) {
                result = indexMid;
                System.out.println("Success! Found the integer " + x + " at index " + result + ".");
                break;
            } else if (data.get(indexMid) > x) {
                indexMax = indexMid;
                System.out.println("This integer is higher than what we're looking for, adjusting bounds to " + indexMin + " and " + indexMax + ".");
            } else {
                indexMin = indexMid;
                System.out.println("This integer is lower than what we're looking for, adjusting bounds to " + indexMin + " and " + indexMax + ".");
            }
        }

        MyTimer.stop();
        return result;
    }
}
