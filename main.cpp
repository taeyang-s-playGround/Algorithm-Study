#include <iostream>
#include <string>
#include <vector>

using namespace std;

//9325
int main() {
    int testcase, carPrice, optionCounts;

    cin >> testcase;

    //테스트 케이스
    for (int i = 0; i < testcase; ++i) {

        //차 가격과 옵션 종류 입력
        cin >> carPrice >> optionCounts;
        int price = carPrice;

        //옵션 종류 수 만큼 가격과 갯수 입력 + price에 그만큼 더해줌
            for (int j = 0; j < optionCounts; ++j) {
                int optionCount, optionPrice;
                cin >> optionCount >> optionPrice;
                price += (optionCount * optionPrice);
            }
        cout << price << "\n";
    }

    return 0;
}

/*
//2742
int main() {
    int A, B, C;
    cin >> A;
    for (int i = A; i >= 1; i--) {
        cout << i << "\n";
    }

    return 0;
}


//10950
int main() {
    int T, A, B;

    cin >> T;

    for (int i = 0; i < T; i++) {
        cin >> A >> B;
        cout << A + B << "\n";
    }
    return 0;
}
*/