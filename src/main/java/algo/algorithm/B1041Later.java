package algo.algorithm;

import java.util.Scanner;

//주사위
public class B1041Later {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long[] arr = new long[5];
        //-------------------------
        //A와 F중 더 작은걸 사용하는 로직이랑  <-- 이건 A, F 중에 더 작은거, B, D중에 작은거, C, E 중에 더 작은걸 구해서 다 더하면 2면의 최솟값
        // n이 1일 때 가장 큰 수를 뺀 나머지를 더해주는 로직을 써줌
        //-------------------------
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }

        long low1 = arr[0];
        long low2 = arr[1];
        long low3 = arr[2];

        long side3 = (low1 + low2 + low3) * 4; //세 면 다 보이는 주사위
        long side2 = (low1 + low2) * ((n * 8) -12); //두 면 보이는 주사위
        long side1 = (low1) * ((n-2)*(n-2) * 5 + (n-2) * 4); //한 명만 보이는 주사위

        System.out.print(side1 + side2 + side3);
    }

}
