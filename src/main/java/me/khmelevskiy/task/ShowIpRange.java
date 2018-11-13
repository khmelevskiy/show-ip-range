package me.khmelevskiy.task;

public class ShowIpRange {
    public static void main(String[] args) {
        InputData reader = new InputData();
        CalculateRangeIP showRangeIP = new CalculateRangeIP();

        reader.Scan();
        showRangeIP.CalculateRange(reader.ipStart, reader.ipEnd);
    }
}