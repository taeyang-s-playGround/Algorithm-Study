package algo.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class algo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] gridBoard = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                gridBoard[i][j] = scanner.nextInt();
            }
        }

        int middle = number / 2;
        int result = execute(middle, gridBoard);
        System.out.println(result);
    }

    public static int execute(int middle, int[][] gridBoard) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        //queue.add(new int[]{middle, middle});
        visited.add(gridBoard[middle][middle]);

        int sum = 0;

        while (!queue.isEmpty()) {

            for (int i = 0; i < middle; i++) {
                int current = queue.poll();

                int[]nextMoves = {gridBoard[middle][middle-1], gridBoard[middle+1][middle], gridBoard[middle][middle+1], gridBoard[middle-1][middle]};

                for (int next : nextMoves) {
                        sum += next;

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }

        return sum;
    }
}

/*
조언 1 : 저 nextMoves를 위로 올림 포문 1번 안으로
조언 2 : 4번 다 돌고나서는 어팬드로다가 딱딱
조언 3 :

5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19
 */