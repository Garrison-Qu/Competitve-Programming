#include <iostream>
#define ll unsigned long long
using namespace std;

ll mul(ll a, ll b, ll m) {
    ll x = 0;
    ll y = a % m;
    while (b) {
        if (b % 2 == 1) {
            x = (x + y) % m;
        }
        y = 2 * y % m;
        b /= 2;
    }
    return x % m;
}

ll pow(ll b, ll p, ll m) {
    ll x = 1;
    ll y = b;
    while (p) {
        if (p % 2 == 1) {
            x = mul(x, y, m);
        }
        y = mul(y, y, m);
        p /= 2;
    }
    return x % m;
}

bool isPrime(ll n, int k) {
    if (n == 2) {
        return true;
    }
    if (n <= 1 || n % 2 == 0) {
        return false;
    }
    ll s = n - 1;
    while (s % 2 == 0) {
        s /= 2;
    }

    for (int i = 0; i < k; i++) {
        ll t = s;
        ll r = pow(rand() % (n-1) + 1, t, n);
        while (t != n-1 && r != 1 && r != n - 1) {
            r = mul(r, r, n);
            t *= 2;
        }
        if (r != n-1 && t % 2 == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    ll n;
    cin >> n;
    while (!isPrime(n, 4)) n++;
    cout << n;
}
