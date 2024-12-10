import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));;

    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> array = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(array.contains(nums[i])){
                return true;
            }else{
                array.add(nums[i]);
            }
        }
        return false;
        
    }
}
