package me.khmelevskiy.task;


import java.util.Arrays;

public class ShowIpRange {
    public static void main(String[] args) {
        InputData reader = new InputData();
        reader.Scan();
        Show(reader.ipStart);
        System.out.println();

        //System.out.println(reader.ipStart[0]);
        /*
        String[] array = new String[] {"John", "Mary", "Bob"};
        System.out.println(Arrays.toString(array));
        Output:
        [John, Mary, Bob]
         */

        //Show(reader.ipEnd);

    }

    public static void Show(String[] str) {
        for (String temp : str) {
            try {
                System.out.println(Integer.parseInt(temp));
            } catch (Exception e) {
                System.out.println("Incorrect input");
            }
        }
    }
}