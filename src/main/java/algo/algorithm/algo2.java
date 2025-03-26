package algo.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class algo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] meetings = new int[n][2]; //이걸로 5x2의 배열을 만들어주고, 미팅들의 모든 정보를 여기에 저장

        // 회의 정보 입력 받기
        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();  // 1번 배열의 0번 째, 2번 배열의 0번 째 <= 시작 시간
            meetings[i][1] = sc.nextInt();  //  1번 배열의 1번 째, 2번 배열의 1번 째 <= 종료 시간
        }

        Arrays.sort(meetings, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]); //이게 뭐지 <- 끝나는 시간을 기준으로 정렬

        int count = 0; //회의 수
        int lastEndTime = 0; //마지막으로 끝나는 시간??

        for (int[] meeting : meetings) { //회의들을 돌면서 하나씩
            if (meeting[0] >= lastEndTime) { //미팅의 시작 시간이 끝나는 시간보다 크면
                count++; //회의 수 증가
                lastEndTime = meeting[1]; // 끝나는 시간은 미팅의 끝나는 시간으로 변경 <--- 끝나는 시간이 짧은 것이 먼저 있기 때문에 가능
            }
        }
        System.out.println(count);
    }
}

// 1. 끝나는 시간을 기준으로 정렬
