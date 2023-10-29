#include <bits/stdc++.h>
using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);

    vector<bool> prime(1e6+1, true);
    for (int p = 2; p * p <= 1e6; p++) {
        if (prime[p]) {
            for (int i = p * p; i <= 1e6; i += p) {
                prime[i] = false;
            }
        }
    }
    prime[1] = false;

    int n;
    cin >> n;
    while (n--) {
        int a, b;
        int count = 0;
        cin >> a >> b;
        for (int i = a; i < b; i++) {
            if (prime[i]) {
                count++;
            }
        }
        cout << count << endl;
    }
    return 0;
}
