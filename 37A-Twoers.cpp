/*
37A-Twoers
*/

#include <map>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;
bool pred(const pair<int, int>& lhs,
const pair<int, int>& rhs)
{
return lhs.second < rhs.second;
}
int maisn()
{
    int n,noOftowers;
    map<int, int> m;
    int maxTwoer=-1;
    int bars[100];
    cin>>n;

    for(int i=0;i<n;i++)
    {
        cin>>bars[i];
        m[bars[i]]++;

    }

    maxTwoer=max_element(m.begin(), m.end(), pred)->second;
    cout<<maxTwoer<<" "<<m.size();


return 0;
}
