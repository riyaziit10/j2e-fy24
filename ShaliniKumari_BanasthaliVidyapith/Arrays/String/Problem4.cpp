#include <iostream>
#include <string>
#include <vector>
using namespace std;

string checkPangrams(vector<string>& pangram) {
    string result;

    for (const string& str : pangram) {
        vector<bool> letterPresent(26, false);
        int count = 0;

        for (char c : str) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!letterPresent[index]) {
                    letterPresent[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            result += '1';
        } else {
            result += '0';
        }
    }

    return result;
}

int main() {
    int n;
    cout << "Enter the number of strings you want to check if they are pangrams or not: ";
    cin >> n;

    vector<string> pangram(n);
    cout << "Enter a list of strings:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Enter string " << (i + 1) << ": ";
        cin >> pangram[i];
    }

    string result = checkPangrams(pangram);
    cout << result << endl;

    return 0;
}
