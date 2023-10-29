#include <bits/stdc++.h>
using namespace std;
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

int N, K;

int calculate (int n, vector<int> houses) {
    int r = N;
    int range = 2*n;
    for (int i = 0 ; i < N && houses[i] < houses[0] + range; i++) {
        int count = 1;
        int temp = houses[i];
        for (int j = i + 1; j < N && houses[j] + range - 1e6 < houses[i]; j++) {
            if (houses[j] > temp) {
                temp = houses[j] + range;
                count++;
            }
        }
        r = min(r, count);
    }
    return r;
}

int main() {
    scan(N);
    vector<int> houses(N);
    for (int i = 0; i < N; i++) {
        scan(houses[i]);
    }
    scan(K);
    sort(houses.begin(), houses.end());
    int l = 0;
    int r = 1e6;
    int ans = 0;
    while (l <= r) {
        int mid = (l+r)/2;
        if (calculate(mid, houses) <= K) {
            ans = mid;
            r = mid-1;
        } else {
            l = mid+1;
        }
    }
    cout << ans;
    return 0;
}
