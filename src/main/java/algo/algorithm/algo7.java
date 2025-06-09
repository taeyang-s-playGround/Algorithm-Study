package algo.algorithm;

import java.util.*;

public class algo7 {
    static int minCount = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 종류 수
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt(); // 목표 금액

        Arrays.sort(coins);
        reverse(coins);

        dfs(coins, amount, 0, 0);

        System.out.println(minCount == Integer.MAX_VALUE ? -1 : minCount);
    }


    public static void dfs(int[] coins, int target, int sum, int count) {
        if (sum > target || count >= minCount) return;
        if (sum == target) {
            minCount = Math.min(minCount, count);
            return;
        }

        for (int coin : coins) {
            dfs(coins, target, sum + coin, count + 1);
        }
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }
}

/*

3
1 2 5
15

3
 */