package me.khmelevskiy.task;

public class ShowIpRange {
    public static void main(String[] args) {
        InputData reader = new InputData();
        CalculateRangeIP showRangeIP = new CalculateRangeIP();

        reader.Scan();
        //Show(showRangeIP.CalculateRange(reader.ipStart, reader.ipEnd));
        Show(reader.ipStart);
        System.out.println();
    }

    public static void Show(String[] str) {
        for (String temp : str) {
            System.out.print(temp);
        }
    }
}