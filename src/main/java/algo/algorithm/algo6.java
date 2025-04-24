package algo.algorithm;

import java.util.Scanner;

public class algo6 {
    static boolean isYes = false; //일단 false로 초기화
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

        if (total % 2 != 0) { //토탈이 2로 나눠지지 않으면 NO
            System.out.println("NO");
            return;
        }

        target = total / 2;
        int zeroCount = 0; //0의 갯수를 세는 변수
        /*
        if (zeroCount.equals(0)) { //토탈이 0이면 YES
            System.out.println("YES");
            return;
        }

         */
        dfs(nums, 0, 0);

        System.out.println(isYes ? "YES" : "NO");
    }



    static void dfs(int[] nums, int index, int sum) {
        if (isYes || sum > target) return;

        if (sum == target) {
            isYes = true;
            return;
        }

        if (index >= nums.length) return; //인덱스가 숫자 갯수보다 커지면 return

        dfs(nums, index + 1, sum + nums[index]);

        dfs(nums, index + 1, sum);
    }
}

/*
6
1 3 5 6 7 10
*/
