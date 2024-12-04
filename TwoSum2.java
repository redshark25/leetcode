public class TwoSum2 {
    
    public static void main(String[] args){
        int[] numbers = {2, 7, 8, 9, 42, 34};
        int target = 9;

       int[] ans = twoSum(numbers, target);
       System.out.println(ans[0] + "    " +ans[1]);
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        int x = 0; 
        int y = numbers.length - 1; 

        while(x <= y){
            int sum = numbers[x] + numbers[y];
            if(target == sum ){
                return new int[]{x+1, y+1};
            }
            else if(target < sum){
                y -= 1;
            }else if(target > sum){
                x += 1;}
        }
        return null;
    }
    
}
