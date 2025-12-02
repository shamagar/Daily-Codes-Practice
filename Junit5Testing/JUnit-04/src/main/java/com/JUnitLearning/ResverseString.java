//This code is demonstration on multiple test using JUnit
package com.JUnitLearning;

public class ResverseString
{
    //Method to reverse the string
    public String inputString(String str)
    {
        //Converting string into an Array
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
