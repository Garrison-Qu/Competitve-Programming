//15/15

#include <iostream>
using namespace std;
int n, s[2][300000], res = 0;
int main()
{
  cin >> n;
  for (int i = 1; i <= n; i++) cin >> s[0][i];
  for (int i = 1; i <= n; i++) cin >> s[1][i];
  for (int i = 1; i <= n; i++)
  {
    if (s[0][i] == 1)
    {
      res += 3;
      if (s[0][i - 1] == 1)
        res--;
      if (s[0][i + 1] == 1)
        res--;
      if (s[1][i] == 1 && i % 2 == 1)
        res--;
    }
  }
  for (int i = 1; i <= n; i++)
  {
    if (s[1][i] == 1)
    {
      res += 3;
      if (s[1][i - 1] == 1)
        res--;
      if (s[1][i + 1] == 1)
        res--;
      if (s[0][i] == 1 && i % 2 == 1)
        res--;
    }
  }
  printf("%d\n", res);
}