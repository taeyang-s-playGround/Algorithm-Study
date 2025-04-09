package algo.algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class algo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = sc.nextInt(); //사람의 수
        int boatMaximum = sc.nextInt(); //보트 최대 무게
        int[] weights = new int[peopleCount]; //사람들의 무게

        for (int i = 0; i < peopleCount; i++) {
            weights[i] = sc.nextInt();  //
        }

        Integer[] weightsList = Arrays.stream(weights).boxed().toArray(Integer[]::new); //내림차순으로 정렬
        Arrays.sort(weightsList); //오름차순으로 정렬

        Integer i = weightsList[0];

        int num2 = peopleCount;
        int boatCount = 0;
        for (int k = 0; k <= peopleCount; k++) {
            for (int j = num2; j > 1; j--) {
                if (weightsList[k] + weightsList[num2-1] <= boatMaximum) {
                    boatCount++;
                }
            }
            num2--;

        }

        //if(weightsList[0] > ){}

    }
}

/*
큐를 사용해야할까?

7 150
50 100 110 120 130 140 150

어머 무겁네 안되네 150 태우고 보내
50이랑 140 들어
안되네 140 보내
50이랑 130 들어

for문을 처음에 뒤에서부터 4번 돌려서 맞는게 있으면 딱 가기

 */