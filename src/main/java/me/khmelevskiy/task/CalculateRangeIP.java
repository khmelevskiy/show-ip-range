package me.khmelevskiy.task;

public class CalculateRangeIP {

    public void CalculateRange(String[] ipStart, String[] ipEnd) {
        int[] ipStartInt = ConvertToInt(ipStart);
        int[] checkFirstIp = ConvertToInt(ipStart);
        int[] ipEndInt = ConvertToInt(ipEnd);

        while (ipStartInt[0] != ipEndInt[0]) {
            Show(ipStartInt, checkFirstIp);
            if (ipStartInt[3] == 255) {
                ipStartInt[2]++;
                ipStartInt[3] = 0;
                if (ipStartInt[2] != 256 && ipStartInt[1] != 256)
                    Show(ipStartInt, checkFirstIp);
            }
            if (ipStartInt[2] == 256) {
                ipStartInt[1]++;
                ipStartInt[2] = 0;
            }
            if (ipStartInt[1] == 256) {
                ipStartInt[0]++;
                ipStartInt[1] = 0;
                --ipStartInt[3];
            }
            ipStartInt[3]++;
        }

        while (ipStartInt[1] != ipEndInt[1]) {
            Show(ipStartInt, checkFirstIp);
            if (ipStartInt[3] == 255) {
                ipStartInt[2]++;
                ipStartInt[3] = 0;
                if (ipStartInt[2] != 256)
                    Show(ipStartInt, checkFirstIp);
            }
            if (ipStartInt[2] == 256) {
                ipStartInt[1]++;
                ipStartInt[2] = 0;
                --ipStartInt[3];
            }
            ipStartInt[3]++;
        }

        while (ipStartInt[2] != ipEndInt[2]) {
            Show(ipStartInt, checkFirstIp);
            if (ipStartInt[3] == 255 && ipStartInt[2] != 256) {
                ipStartInt[2]++;
                ipStartInt[3] = 0;
                Show(ipStartInt, checkFirstIp);
            }
            ipStartInt[3]++;
        }

        while (ipStartInt[3] != ipEndInt[3]) {
            Show(ipStartInt, checkFirstIp);
            ipStartInt[3]++;
        }
    }


    private int[] ConvertToInt(String[] str) {
        int[] ip = new int[4];
        for (int i = 0; i < str.length; i++) {
            ip[i] = Integer.parseInt(str[i]);
        }
        return ip;
    }

    private void Show(int[] arr, int[] check) {
        if (check[0] == arr[0] && check[1] == arr[1] && check[2] == arr[2] && check[3] == arr[3]) {
        } else {
            System.out.println(Integer.toString(arr[0]) + "." + Integer.toString(arr[1]) + "." + Integer.toString(arr[2]) + "." + Integer.toString(arr[3]));
        }
    }
}
