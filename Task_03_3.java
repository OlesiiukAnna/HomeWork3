package org.anna.task_3;

public class Task_03_3 {
    public static void main(String[] args) {
        String basicString = "#1AmC";
        String newString = returnLowerCase(basicString);

        System.out.println("Строка до: " + basicString + "\n"
                            + "Строка после: " + newString);
    }

    public static String returnLowerCase(String basicString) {
        int differenceInAscii = 32;       /* Разница между a(97) и A(65) согласно таблице ASCII */
        char[] basicStringArray = basicString.toCharArray();

        for (int i = 0; i < basicStringArray.length; i++) {
            if (65 <= basicStringArray[i] && basicStringArray[i] <= 90) {
                basicStringArray[i] += differenceInAscii;
            }
        }

        return new String(basicStringArray);
    }

}
