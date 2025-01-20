package Gyudeok;

import java.util.Scanner;

public class No_18108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int buddhist_year = sc.nextInt();
        int common_year = buddhist_year - 543;
        System.out.println(common_year);
        sc.close();
    }
}