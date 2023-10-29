#include <bits/stdc++.h>
using namespace std;
#define scan(x) do{while((x=getchar())<'0'); for(x-='0'; '0'<=(_=getchar()); x=(x<<3)+(x<<1)+_-'0');}while(0)
char _;

int besthub(int R, int L, int X[], long long B) {
    int l = 1;
    int r = R;
    int n;
    while (l != r) {
        n = (l+r)/2+1;

        int ll = 0;
        int lr = n/2;
        int rl = n/2;
        int rr = n;
        if (n % 2) {
            rl++;
        }

        long long lsum = 0;
        long long rsum = 0;
        for (int i = ll; i < lr; i++) {
            lsum += X[i];
        } for (int i = rl; i < rr; i++) {
            rsum += X[i];
        }

        while (rr < R && rsum - lsum > B) {
            lsum += X[lr] - X[ll];
            rsum += X[rr] - X[rl];
            ll++;
            lr++;
            rl++;
            rr++;
        }

        if (rsum - lsum > B) {
            r = n-1;
        } else {
            l = n;
        }
    }
    return l;
}
