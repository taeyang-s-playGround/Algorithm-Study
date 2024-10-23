package algo.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최소, 최대
public class B10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        for (int i =0; i<count; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }

}
