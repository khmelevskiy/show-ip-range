package me.khmelevskiy.task;

import java.util.Scanner;

public class InputData {

    String inputLine;
    String[] ipStart;
    String[] ipEnd;

    ConvertInputData ipRange = new ConvertInputData();
    Scanner scn = new Scanner(System.in);

public void Scan() { //max 223.225.255.255
    InputLine("start");
    ipStart = ipRange.Convert(inputLine);
    //InputLine("end");
    //ipEnd = ipRange.Convert(inputLine);
}
public void InputLine(String str) {
    System.out.println("Enter ip " + str +" range\nFormat XXX.XXX.XXX.XXX\nMax value 223.255.255.255:");
    inputLine = scn.nextLine();
}
}
