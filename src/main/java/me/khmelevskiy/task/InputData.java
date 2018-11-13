package me.khmelevskiy.task;

import java.util.Scanner;

public class InputData {

    String inputLine;
    String[] ipStart;
    String[] ipEnd;

    ValidationInputData ipValidate = new ValidationInputData();
    Scanner scn = new Scanner(System.in);

    public void Scan() {
        InputLine("start");
        if (ipValidate.Check(inputLine)) {
            ipStart = inputLine.split("\\.");
        } else {
            System.out.println("Incorrect input, please repeat input!");
            Scan();
        }

        InputLine("end");
        if (ipValidate.Check(inputLine)) {
            ipEnd = inputLine.split("\\.");
        } else {
            System.out.println("Incorrect input, please repeat input!");
            Scan();
        }

        if (!(ipValidate.CheckIpStartEnd(ipStart, ipEnd))) {
            System.out.println("Incorrect range IP, repeat input!");
            Scan();
        }
    }

    private void InputLine(String str) {
        System.out.println("Enter ip " + str + " range\nFormat XXX.XXX.XXX.XXX\nMin value: 1.0.0.0\nMax value: 223.255.255.255:");
        inputLine = scn.nextLine();
    }
}
