

#include <iostream>
#include <strings.h>

using namespace std;
int hamming_distance(string& fs, string ss){
    int hm_distance = 0;

    if((fs.length() == ss.length())){

      for(int i = 0; i < fs.length(); i++){
        if(!(fs[i] == ss[i])){
          hm_distance++;
        }
      }
        if(hm_distance==0)
            return 1;
    }else{
      hm_distance = -1;
    }
    return hm_distance;
}
int main()
{
        string  words [10];
        int n;
        cin>>n;
        for(int i=0;i<n;i++)
        {
            cin>>words[i];


        }
         for(int i=0;i<n;i++)
        {

            if(hamming_distance(words[i],"one")==1  )
            {
                cout<<1<<endl;
                continue;
            }
            else if(hamming_distance(words[i],"two")==1)
            {
                cout<<2<<endl;
                continue;
            }
            else if(hamming_distance(words[i],"three")==1)
            {
                cout<<3<<endl;
                continue;
            }

        }
return 0;

}






