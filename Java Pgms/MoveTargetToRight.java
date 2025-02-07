// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] nums = {6,1,6,8,10,4,15,6,3,9,6};
        int target = 6;
        int[] res = result(nums,target);
        
        for (int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
        
    
       // System.out.println(res[0]+" "+res[1]);
    }
    
    public static int[] result(int[] nums, int target) {
        //Set<Integer> numSet = new HashSet<Integer>();
        int strIdx = 0, endIdx = nums.length-1;
        while (strIdx!=endIdx) {
            if (nums[strIdx]==6) {
                int temp;
                
                while (nums[endIdx]==6) {
                    endIdx--;
                }
                
                temp = nums[strIdx];
                nums[strIdx] = nums[endIdx];
                nums[endIdx] = temp;
                endIdx--;
            }
            strIdx++;
        }
        return nums;
    }
    
}
