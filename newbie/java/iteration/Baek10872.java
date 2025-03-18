// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
package newbie.java.iteration;
import java.util.Scanner;

public class Baek10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fac = 1;
        for( int i = 0; i < a; i++) {
           fac  *= (a-i);
        }

        System.out.println(fac);
    }

}
