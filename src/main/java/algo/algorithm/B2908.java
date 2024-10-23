package algo.algorithm;

import java.util.Scanner;

//상수
public class B2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num1high = num1/100;
        int num1middle = (num1/10) % 10;
        int num1low = num1 % 10;

        int num2high = num2/100;
        int num2middle = (num2/10) % 10;
        int num2low = num2 % 10;

        int reversedNum1 = (num1low * 100) + (num1middle * 10) + num1high;
        int reversedNum2 = (num2low * 100) + (num2middle * 10) + num2high;

        System.out.print(Math.max(reversedNum1, reversedNum2));

    }

}
