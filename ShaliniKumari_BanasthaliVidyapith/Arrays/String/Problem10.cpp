#include <iostream>
#include <algorithm>
using namespace std;

string nextPermutation(const string& word) {
    string nextWord = word;

    // Find the largest index i such that word[i] < word[i+1]
    int i = nextWord.length() - 2;
    while (i >= 0 && nextWord[i] >= nextWord[i + 1]) {
        i--;
    }

    if (i >= 0) {
        // Find the largest index j such that word[j] > word[i]
        int j = nextWord.length() - 1;
        while (j > i && nextWord[j] <= nextWord[i]) {
            j--;
        }

        // Swap word[i] and word[j]
        swap(nextWord[i], nextWord[j]);
    } else {
        // If no such i exists, the word is in decreasing order, no greater permutation
        return "no answer";
    }

    // Reverse the suffix from i+1 to get the next lexicographically greater permutation
    reverse(nextWord.begin() + i + 1, nextWord.end());

    return nextWord;
}

int main() {
    string word;
    cout << "Enter the word: ";
    cin >> word;

    string nextPerm = nextPermutation(word);
    cout << "Next lexicographically greater permutation: " << nextPerm << endl;

    return 0;
}
