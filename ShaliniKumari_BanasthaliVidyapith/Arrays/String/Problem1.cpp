#include <iostream>
#include <stack>
using namespace std;

bool backspaceCompare(string s, string t) {
    stack<char> ss;
    stack<char> st;
    
    for (int i = 0; i < s.size(); i++) {
        if (s[i] != '#') {
            ss.push(s[i]);
        } else {
            if (!ss.empty())
                ss.pop();
        }
    }
    
    for (int i = 0; i < t.size(); i++) {
        if (t[i] != '#') {
            st.push(t[i]);
        } else {
            if (!st.empty())
                st.pop();
        }
    }
    
    return ss == st;
}

int main() {
    string s, t;
    cout << "Enter string s: ";
    cin >> s;
    cout << "Enter string t: ";
    cin >> t;
    
    bool result = backspaceCompare(s, t);
    if (result) {
        cout << "Strings are equal after applying backspace." << endl;
    } else {
        cout << "Strings are not equal after applying backspace." << endl;
    }
    
    return 0;
}
