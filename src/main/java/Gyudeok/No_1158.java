package Gyudeok;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class No_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }

        int sum = -1;
        sum += m; // 첫 순서 지정
        System.out.print("<");
        for (int i = 0; i < n; i++) { // 리스트가 다 비워지면 실행 X
            if (!arr.isEmpty()) {  // arr 가 남아있을 때
                System.out.print(arr.get(sum));
                arr.remove(sum);
                sum += m - 1;
                if (sum >= arr.size() && !arr.isEmpty()) {  // 0이 아닐때 확인
                    sum = sum % arr.size();
                }
                if (i != n - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(">");
    }
}
