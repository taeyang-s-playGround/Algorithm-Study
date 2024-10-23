package algo.algorithm;

import java.util.Scanner;

//최댓값
public class B2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[9][9];

        int max = 0;
        int a = 0, b = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();

                if (array[i][j] > max) {
                    max = array[i][j];
                    a = i;
                    b = j;
                }

            }
        }

        sc.close();

        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));

    }

/*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        int high = 0;
        int y = 0;
        int x = 0;
        for (int i = 0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j<9; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());
                if (high < arr[i][j]) {
                    high = arr[i][j];
                    y = i+1;
                    x = j+1;
                }
            }
        }
        br.close();

        System.out.println(high);
        System.out.print(x + " " + y);

    }
    */


}
