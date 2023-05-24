/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.
 
Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:
Input: x = 3, y = 1
Output: 1
*/
class Solution {
    public int hammingDistance(int x, int y) {
        String n1=bin(x);
        String n2=bin(y);
        int ct=0;
        if(n1.length()>n2.length())
        {
            for(int i=n2.length();i<n1.length();i++)
            {
                n2='0'+n2;
            }
        }
        else
        {
            for(int i=n1.length();i<n2.length();i++)
            {
            n1='0'+n1;
            }
        }

        
        for(int i=0;i<n1.length();i++)
        {
            if(n1.charAt(i)!=n2.charAt(i))
            {
                ct++;
            }
        }
        return ct;
    }
    public String bin(int a)
    {
        String ans="";
        while(a!=0)
        {
            ans=(a%2)+ans;
            a=a/2;
        }
        return ans;
    }
}
