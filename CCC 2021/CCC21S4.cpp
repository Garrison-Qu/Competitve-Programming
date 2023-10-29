#include <iostream>
#include <vector>
#include <set>
#include <queue>
using namespace std;
char _;
template <typename U>
#define dd(i) (prem[i] == N ? i : i + dist[prem[i]]) - 1
void scan(U &x) {
    while ((x = getchar()) < '0');
    for (x -= '0'; '0' <= (_ = getchar()); x = (x << 3) + (x << 1) + _ - '0');
}


int N, W, D;
vector<vector<int>> adj(2e5+1);
vector<bool> visited(2e5+1, false);
vector<int> dist(2e5+1, 1e9);
vector<int> prem(2e5+1);
multiset<int> ms;


int main() {
    scan(N);
    scan(W);
    scan(D);
    for (int i = 0; i < W; i++) {
        int x, y;
        scan(x);
        scan(y);
        adj[y].push_back(x);
    }
    queue<int> q;
    dist[N] = 0;
    visited[N] = true;
    q.push(N);
    while (!q.empty()) {
        int u = q.front();
        q.pop();
        for (auto v: adj[u]) {
            if (!visited[v]) {
                dist[v] = dist[u] + 1;
                visited[v] = true;
                q.push(v);
            }
        }
    }
    for (int i = 1; i <= N; i++) {
        int x;
        scan(x);
        prem[i] = x;
        ms.insert(dd(i));
    }
    for (int i = 0; i < D; i++) {
        int x, y;
        scan(x);
        scan(y);
        ms.erase(ms.find(dd(x)));
        ms.erase(ms.find(dd(y)));
        swap(prem[x], prem[y]);
        ms.emplace(dd(x));
        ms.emplace(dd(y));
        cout << *ms.begin() << endl;
    }
    return 0;
}
