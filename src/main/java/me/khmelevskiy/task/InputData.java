package me.khmelevskiy.task;

import java.util.Scanner;

public class InputData {
String inputLine;

public void Scan() {
    System.out.println("Enter one ip:");
    Scanner scn = new Scanner(System.in);
    inputLine = scn.nextLine();
}
}
