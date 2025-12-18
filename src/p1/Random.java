package p1;

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {

        System.out.println("randomArray(3): " + Arrays.toString(randomArray(3)));
        System.out.println("randomArray2(5): " + Arrays.toString(randomArray2(5)));
        System.out.println("randomArray3(): " + Arrays.toString(randomArray3()));
        System.out.println("randomArray4(4): " + Arrays.toString(randomArray4(4)));
    }

    public static int[] randomArray(int x) {
        java.util.Random rand = new java.util.Random();
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = rand.nextInt();
        }
        return array;
    }

    public static int[] randomArray2(int x) {
        java.util.Random rand = new java.util.Random();
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = rand.nextInt(x);
        }
        return array;
    }
    public static int[] randomArray3() {
        java.util.Random rand = new java.util.Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(21) + 55;
        }
        return array;
    }


    public static int[] randomArray4(int n) {
        java.util.Random rand = new java.util.Random();
        int[] array = new int[n + 1];
        int summe = 0;

        for (int i = 0; i < n; i++) {
            int zufallsZahl = rand.nextInt(50) + 1;
            array[i] = zufallsZahl;
            summe += zufallsZahl;
        }

        
        int mittelwert = summe / n;
        array[n] = mittelwert;

        return array;
    }
}
