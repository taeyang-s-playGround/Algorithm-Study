package algo.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class B2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(numbers[i] / 25);
            numbers[i] = numbers[i] - 25 * (numbers[i] / 25);
            System.out.print(numbers[i] / 10);
            numbers[i] = numbers[i] - 10 * (numbers[i] / 10);
            System.out.print(numbers[i] / 5);
            numbers[i] = numbers[i] - 5 * (numbers[i] / 5);
            System.out.print(numbers[i] / 1);
            System.out.println(" ");
        }
    }
}
// 1,2,3,4 의 순서가 있는데, 1은 25, 2는 10, 3은 5, 4는 1
