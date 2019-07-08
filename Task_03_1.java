package org.anna.task_3;

public class Task_03_1 {
    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "caсAcA";

        System.out.println("Jewels in stones: " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int jewelsInStones = 0;
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();

        for (char c : jewelsArray) {
            for (char value : stonesArray) {
                if (c == value) {
                    jewelsInStones++;
                }
            }
        }
        return jewelsInStones;
    }
}


