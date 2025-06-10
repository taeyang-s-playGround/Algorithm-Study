package algo.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class algo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int target = scanner.nextInt();

        int result = execute(start, target);
        System.out.println(result);
    }

    public static int execute(int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                int[] nextMoves = {current + 1, current - 1, current + 5};

                for (int next : nextMoves) {
                    if (next == target) {
                        return level;
                    }

                    if (next >= 0 && !visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }

        return 0;
    }
}
