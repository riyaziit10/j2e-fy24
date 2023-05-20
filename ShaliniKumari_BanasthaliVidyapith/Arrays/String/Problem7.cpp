#include <iostream>
#include <unordered_set>
using namespace std;

int countUniqueSubstrings(const string& s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        unordered_set<char> seenChars;
        for (int j = i; j < s.length(); j++) {
            if (seenChars.count(s[j]) > 0) {
                break;
            }
            seenChars.insert(s[j]);
            count++;
        }
    }

    return count;
}

int main() {
    string s;
    cout << "Enter the string: ";
    cin >> s;
    int count = countUniqueSubstrings(s);
    cout << count << endl;

    return 0;

    return 0;
}
