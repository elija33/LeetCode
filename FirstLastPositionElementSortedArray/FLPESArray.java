package FirstLastPositionElementSortedArray;

public class FLPESArray{
    public static int FirstPositionElementSortedArray(int nums[], int target){
        int starting = 0;
        int ending = nums.length - 1;
        int index = -1;

        while(starting <= ending){
            int mid = starting + (starting - ending) / 2;

            if(nums[mid] >= target){
                ending =  mid - 1;
            }
            else {
                starting = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    public static int LastPositionElementSortedArray(int nums[], int target){
        int index = -1;
        int starting = 0;
        int ending = nums.length - 1;

        while(starting <= ending){
            int mid = starting + (starting - ending) / 2;

            if(target > nums[mid]){
                starting = mid + 1;
            }
            else{ 
                ending = mid - 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
    public static void main(String[] args) {
        int nums[] = {5,4,5,5,5,9,9,9,9,7,9};
        int target = 9;
        System.out.println();
    }


}