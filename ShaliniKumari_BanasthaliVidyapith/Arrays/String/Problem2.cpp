#include <iostream>
#include <string>
using namespace std;

int findMinPackets(string str) {
    int count = 0;
    for (int i = 1; i < str.length(); i++) {
        if (str[i] != str[i - 1]) {
            count++;
        }
    }
    return count + 1;
}

int main() {
    string inputStr;
    cout << "Enter a string containing binary numbers only: ";
    cin >> inputStr;

    int minPackets = findMinPackets(inputStr);
    cout << minPackets << endl;

    return 0;
}
