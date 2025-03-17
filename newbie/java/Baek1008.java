/*10998
 * a/b 출력
 a > 0 , b < 10
 *  */

package newbie.java;
import java.util.Scanner;

public class Baek1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if ( a <= 0 || b >= 11 ) {
            System.out.println("입력값이 틀렸습니다");
            return;
        }
        System.out.println(a/b);
    }

}