class Solution {
public:
    bool isPalindrome(string s) {
        string result;
        for (char c : s) {
            if (isalnum(c))
                result += tolower(c);
        }
        int n=result.size();
        int i=0;
        while(i<n/2){
            if(result[i]==result[n-i-1])
                i++;
            else return false;
        }
        return true;
    }
};