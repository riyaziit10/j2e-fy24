#include <iostream>
#include <string>
using namespace std;

int findMinMoves(string word) {
    string sb = word;
    int moves = 0;
    int i = 0;

    while (i < sb.length()) {
        char currentChar = sb[i];
        int leftIndex = sb.rfind(string(1, currentChar), i - 1);
        int rightIndex = sb.find(string(1, currentChar), i + 1);

        if (leftIndex != -1 && rightIndex != -1) {
            sb.erase(rightIndex, 1);
            sb.erase(leftIndex, 1);
            sb.erase(i - 1, 1);
            moves += 3;
            i = max(i - 2, 0);
        } else {
            i++;
        }
    }

    return moves;
}

int main() {
    string word;
    cout << "Enter the word: ";
    cin >> word;

    int moves = findMinMoves(word);
    cout << "Minimum number of moves: " << moves << endl;

    return 0;
}
