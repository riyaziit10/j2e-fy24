#include <iostream>
#include <unordered_set>
using namespace std;

string checkPalindrom(const string& s){
    string a="";
    for(int i=s.size()-1;i>=0;i--){
        a+=s[i];
    }
    return a;
}
int countPalindrom(const string& s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            if(s.substr(i,j+1)==checkPalindrom(s.substr(i,j+1))){
                count++;
            }
        }
    }

    return count;
}
int main() {
    string s;
    cout << "Enter the string: ";
    cin >> s;
    int count = countPalindrom(s);
    cout << count << endl;

    return 0;

    return 0;
}
