package algo.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class algo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> NList = new ArrayList<>();
        List<String> NStrings = new ArrayList<>();
        int num = 0;

        for (int i = 0; i < N; i++) {
            NList.add(sc.nextInt());
        }

        if (NList.get(0) > NList.get(N - 1)) { //더 작은 수를 찾아야함!!
            num = NList.get(N-1); //마지막 수가 더 작을 때
            NList.remove(N-1); //마지막 수를 없애고
            NStrings.add("R"); //R을 넣어줌
        } else {
            num = NList.get(0); //삭제하는 값을 저장해둠
            NList.remove(0);
            NStrings.add("L");
        }

        for (int i = 0; i < N; i++) {

            if (NList.get(0) > NList.get(N - 2 - i) &&  NList.get(N - 2 - i) > num) { //오른쪽을 할 차례
                num = NList.get(N - 2 - i); //마지막 수가 더 작을 때
                NList.remove(N-2-i); //마지막 수를 없애고
                NStrings.add("R"); //R을 넣어줌
            } else if(NList.get(N - 2 - i) > NList.get(0) && NList.get(0) > num) { //왼쪽을 할 차례
                num = NList.get(0); //삭제하는 값을 저장해둠
                NList.remove(0);
                NStrings.add("L");
            } else if (NList.get(0) > num || NList.get(N - 2 - i) > num) {
                if (NList.get(0) > NList.get(N - 2 - i)) {
                    num = NList.get(0);
                    NList.remove(0);
                    NStrings.add("L");
                } else if (NList.get(N - 2 - i) > NList.get(0)) {
                    num = NList.get(N - 2 - i);
                    NList.remove(N-2-i);
                    NStrings.add("R");
                }
            } else {
                break;
            }
        }
        System.out.println(NStrings.size());
        System.out.println(String.join("", NStrings));
    }
}

/*

5
2 4 5 1 3

10
3 2 10 1 5 4 7 8 9 6

 */
