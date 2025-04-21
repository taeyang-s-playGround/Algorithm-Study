package algo.algorithm;

import java.util.Scanner;

public class algo6 {
    static boolean isTrue = false; //일단 false로 초기화
    static int target; //sum의 절반을 저장할 변수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }

        if (total % 2 != 0) {
            System.out.println("NO");
            return;
        }

        target = total / 2;

        dfs(nums, 0, 0);

        System.out.println(isTrue ? "YES" : "NO");
    }

    static void dfs(int[] nums, int index, int sum) {
        if (isTrue || sum > target) return;

        if (sum == target) {
            isTrue = true;
            return;
        }

        if (index >= nums.length) return;

        dfs(nums, index + 1, sum + nums[index]);

        dfs(nums, index + 1, sum);
    }
}

/*

6
1 3 5 6 7 10
*/
