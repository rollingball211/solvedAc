package date_20260119;

import java.util.Scanner;
public class Baek1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i =0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 1;

            //a를 b번 곱하지만, 10으로 나누면 오버플로우가 발생하지 않음

            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }

            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }


    }

}