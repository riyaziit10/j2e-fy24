#include <iostream>
#include <stack>
using namespace std;

int minSwaps(string s) {
    int swaps = 0;
    stack<char> stk;
    for (char ch : s) {
        if (ch == '[') {
            stk.push(ch);
        } else {
            if (!stk.empty() && stk.top() == '[') {
                stk.pop();
            } else {
                swaps++;
            }
        }
    }
    return (swaps + 1) / 2;
}

int main() {
    string s;
    cout << "Enter a string containing only the characters '[' and ']': ";
    getline(cin, s);
    int minSwaps = minSwaps(s);
    cout << "Minimum number of swaps required: " << minSwaps << endl;
    return 0;
}
