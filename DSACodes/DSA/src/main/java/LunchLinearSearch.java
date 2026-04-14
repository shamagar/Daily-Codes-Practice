
class Search
{
    public int LinearSearch(int nums[], int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
//Main method
public class LunchLinearSearch
{
    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5,6,7,8,9,10};

        //Initialization the class
        Search search = new Search();
        int result = search.LinearSearch(nums, 9);

        if(result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");

    }
}
