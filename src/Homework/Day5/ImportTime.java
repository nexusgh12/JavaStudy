package Homework.Day5;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ImportTime {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(date.format(today));
    }
}
