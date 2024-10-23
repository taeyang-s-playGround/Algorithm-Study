#include <iostream>
#include <string>
#include <vector>
#include <sstream>

using namespace std;


//1408
int main() {

    //1번 시간 = 현재 시간
    //2번 시간 = 임무를 시작한 시간
    // 구해야 하는 시간 = 임무를 시작한 시간(2번) - 현재 시간?(1번)
    //만약 1번이 3시고 2번이 1시라면? (if (1>2))
    // 구해야하는 시간 = 임무를 시작한 시간(2번) - 현재 시간 + 24시간

    string firstTime, secondTime, final;
    int hours, minutes, seconds;

    cin >> firstTime >> secondTime;
    istringstream ss(firstTime);

    string stringBuffer;
    getline(ss, stringBuffer, ':');
    ss >> hours >> minutes >> seconds;

    cout << hours << ":" << minutes << ":" << seconds;

    return 0;
}

/*
//5565
int main() {
    int allPrice, price, optionCounts;

    cin >> allPrice;

    for (int i = 0; i < 9; ++i) {
        cin >> price;
        allPrice -= price;
    }

    cout << allPrice;

    return 0;
}

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