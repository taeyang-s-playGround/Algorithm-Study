package algo.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공 바꾸기
public class B10813 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] basket = new int[length];

        for (int i = 0; i < length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            int num = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = num;

        }

        for (int j : basket) {
            System.out.print(j + " ");
        }
    }

}
