//This code is demonstration on the reversing the given string
package com.JUnitLearning;

public class ReverseString
{
    //Method to reverse the given string
    public String reverseString(String str)
    {
        //Convert the given string to Array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        //Swap characters at the left and right positions
        while (left < right)
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            //Move the pointers towards each other
            left++;
            right--;
        }
        return new String(charArray);
    }
}
