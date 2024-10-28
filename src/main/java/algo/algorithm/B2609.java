package algo.algorithm;

import java.util.Scanner;

public class B2609 {

    public static int execute(int num1, int num2) {
        int r;

        if (num1 > num2 && num2 != 0) {
            do {
                r = num1 % num2;
            } while (num2 % r != 0);
        } else if (num1 < num2 && num2 != 0) {
            do {
                r = num2 % num1;
            } while (num1 % r != 0);
        }
        else {
            r = 0;
        }

        return r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //최대 공약수, 최소 공배수와 를 구함

        //유클리드 호제법 이용
        //유클리드 호제법 : 두 수를 계속해서 나누어 0이 될때 최대 공약수가 나옴
        // 24 18이라면, 아래와 같이 num2 % r이 0이 나올 때까지 나눠준다
        // 24 % 18 = 6
        // 18 % 6 = 0

        int max = execute(num1, num2);
        int min = (num1 * num2) / max;

        System.out.print(max + "\n" + min);
    }

}
