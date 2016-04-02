#include <iostream>

using namespace std;
char twoDGrid [4][4];
bool isAlreadyTwoByTwo(int i, int j)
{
    if(i+1 == 4 || j+1 == 4)    // don't access outside array
        return false;

    return twoDGrid[i][j] == twoDGrid[i][j+1] && twoDGrid[i][j] == twoDGrid[i+1][j] && twoDGrid[i][j] == twoDGrid[i+1][j+1];
}

int main()
{
      bool pass=false;

			for(int i = 0; i < 4; ++i){
			 for(int j = 0; j < 4; ++j){
                cin>>twoDGrid[i][j];
            }
		}
		for(int i = 0; i < 4; ++i)
            {
                for(int j = 0; j < 4; ++j)
                    if(isAlreadyTwoByTwo(i, j))
                        pass=true;
            }


			for(int i = 0; i < 4; ++i){
			if (pass)
				break;
			 for(int j = 0; j < 4; ++j){
				if (twoDGrid[i][j] == '.') {
					if (i + 1 != 4 && j + 1 != 4)
						if (twoDGrid[i][j + 1] == '#'
								&& twoDGrid[i + 1][j + 1] == '#'
								&& twoDGrid[i + 1][j] == '#') {
							pass = true;
							break;
						}
				} else if (twoDGrid[i][j] == '#') {
					if (i + 1 != 4 && j + 1 != 4)
						if (twoDGrid[i][j + 1] == '.'
								&& twoDGrid[i + 1][j + 1] == '.'
								&& twoDGrid[i + 1][j] == '.') {
							pass = true;
							break;
						}
				}
			}

			}

        if(pass)
		cout<<"YES"<< endl;
		else
		cout<<"NO"<< endl;




    return 0;
}
