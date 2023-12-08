#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);

    int N;
    cin >> N;
    vector<int> pref(N);
    vector<int> last(N);
    vector<double> dp(N);
    for (int i = 0; i < N; i++) {
        cin >> pref[i];
        last[pref[i]] = i;
    }

    int coach = pref[0];
    int josh = pref[N-1];
    double rec = 1.0/N;
    for (auto i = 0; i < N; i++) {
        if (pref[i] != coach) {
            dp[pref[i]] += rec;
        }
        if (last[pref[i]] == i) {
            rec += dp[pref[i]]/(N-i);
        }
    }

    cout << setprecision(8) << (1-dp[josh]);
    return 0;
}
