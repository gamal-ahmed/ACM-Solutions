
#include <iostream>

using namespace std;

int main()
{
        int  magents [100000];
        int groups=0;
        int group01=0;
        int cuurent,last;
        int n;
        cin>>n;
        bool newGroup=true;
        for(int i=0;i<n;i++)
        {
            cin>>magents[i];
            cuurent=magents[i];
            if(i!=0)
            last=magents[i-1];
            if(last!=cuurent)
            groups++;
        }

        cout<<groups;

return 0;

}

