#include <iostream>
#include <string>
using namespace std;

string compressString(const string& message) {
    string compressed;
    int count = 1;

    for (int i = 0; i < message.length(); i++) {
        if (i + 1 < message.length() && message[i] == message[i + 1]) {
            count++;
        } else {
            compressed += message[i];
            if (count > 1) {
                compressed += to_string(count);
                count = 1;
            }
        }
    }

    return compressed;
}

int main() {
    string message;
    cout << "Enter the string: ";
    cin >> message;

    string compressedString = compressString(message);
    cout << "Compressed string: " << compressedString << endl;

    return 0;
}
