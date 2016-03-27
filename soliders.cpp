
#include <iostream>

using namespace std;

int mainw()
{
        int  solidres [100];
        int minum=12222;
        int maxum=-1;
        int maxIndex,minIndex,input;
        int soliderHeight,secondes,noOfSoliders;
        cin>>noOfSoliders;
        if(noOfSoliders<=100 && noOfSoliders>=2){
        for(int i=0;i<noOfSoliders;i++)
        {
            cin>>solidres[i];

            if(solidres[i]<=minum)
               {
                   minum=solidres[i];
                   minIndex=i;
               }
            if (solidres[i]>maxum)
               {
                 maxum=solidres[i];
                 maxIndex=i;
               }

        }
        if(maxIndex>minIndex)
        secondes=maxIndex-0+noOfSoliders-1-minIndex-1;
        else
        secondes=maxIndex-0+noOfSoliders-1-minIndex;



        cout<<secondes;


}
return 0;
}
