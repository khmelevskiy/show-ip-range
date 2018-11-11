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

    public boolean CheckRangeIP(int value, int checkOneValueIP) {
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
}