package algo.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class algo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가로의 길이
        int[] Lists = new int[n];

        int lowest = 0; //가장 작은 수
        int highest = 0; //가장 큰 수
        int lowIndex = -1;
        int highIndex = -1;

        for (int i = 0; i < n; i++) {
            Lists[i] = sc.nextInt();  // L 개의 자연수
        }
        int nn = sc.nextInt(); //높이 조정 횟수

        for (int i = 0; i < nn; i++) { //50번 반복

            lowest = Lists[0];
            highest = Lists[0];
            lowIndex = 0;
            highIndex = 0;

            for (int j = 0; j < n; j++) {
                if (Lists[j] < lowest) { // 가장 작은 값 찾기
                    lowest = Lists[j];
                    lowIndex = j;
                }
                if (Lists[j] > highest) { // 가장 큰 값 찾기
                    highest = Lists[j];
                    highIndex = j;
                }
            }

            Lists[lowIndex]++;
            Lists[highIndex]--;
        }

        System.out.println(highest - lowest);

    }
}

//일단 가장 큰 수와 가장 작은 수를 구함,
//가장 작은수 ++, 가장 큰수 --
//배열을 다시 돌면서 검사를 함
//nn 번 반복 한 후에 딱딱 하기

//20번 반복하기
/*
{
    만약 배열을 전부 돌아서 검증이 된다면 --, ++
}
 */
/*
            if (meetings[i] > lowest) {
                lowest = meetings[i]; //가장 작은 수 설정
            }
            if (meetings[i] < highest) {
                highest = meetings[i]; //가장 큰 수 설정
            }
 */

/*
10
69 42 68 76 40 87 14 65 76 81
50

20
 */