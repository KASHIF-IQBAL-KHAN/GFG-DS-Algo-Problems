/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  01-May-2021

class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int max = *max_element(candies.begin() , candies.end());
        vector<bool> vect;
        
        for(int itr=0; itr<candies.size(); ++itr){
            if(candies[itr] + extraCandies >= max){
                vect.push_back(true);
            }
            else{
                vect.push_back(false);
            }
        }
        return vect;
    }
};