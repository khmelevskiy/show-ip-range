package me.khmelevskiy.task;

public class ValidationInputData {

    public boolean Check(String str) {
        String[] strArr = str.split("\\.");
        int checkOneValueIP = -1;
        for (String temp : strArr) {
            try {
                checkOneValueIP++;
                Integer.parseInt(temp);
                if (!(CheckRangeIP(Integer.parseInt(temp), checkOneValueIP)))
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    private boolean CheckRangeIP(int value, int checkOneValueIP) {
        if (checkOneValueIP > 0 && checkOneValueIP <= 3) {
            if (!(value >= 0 && value <= 255)) {
                return false;
            }
        } else {
            if (!(value >= 1 && value <= 233) || checkOneValueIP > 3) {
                return false;
            }
        }
        return true;
    }

    public boolean CheckIpStartEnd(String[] ipStart, String[] ipEnd) {//error!!!
        int[] ipStartInt = ConvertToInt(ipStart);
        int[] ipEndInt = ConvertToInt(ipEnd);
        for (int i = 0; i < 4; i++) {
            if (ipStartInt[i] > ipEndInt[i] && !Check(ipStartInt, ipEndInt)) {
                return false;
            }
        }
        return true;
    }

    private boolean Check(int[] ipStart, int[] ipEnd) {
        for (int i = 0; i < 4; i++) {
            if (ipStart[i] < ipEnd[i]) {
                return true;
            }
        }
        return false;
    }

    private int[] ConvertToInt(String[] str) {
        int[] ip = new int[4];
        for (int i = 0; i < str.length; i++) {
            ip[i] = Integer.parseInt(str[i]);
        }
        return ip;
    }
}