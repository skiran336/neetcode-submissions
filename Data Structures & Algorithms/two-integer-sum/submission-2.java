class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] nums1 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums1);
        int small = 0;
        int big = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums1[small] + nums1[big] == target){
                result[0] = nums1[small];
                result[1] = nums1[big];
                break;
            }
            else if(nums1[small] + nums1[big] > target){
                big -= 1;
            }
            else{
                small += 1;
            }
        }
        int idx0 = -1, idx1 = -1;
        for(int i=0; i < nums.length; i++){
            if(idx0 == -1 && nums[i] == result[0]){
                idx0 = i;
            } else if(idx1 == -1 && nums[i] == result[1]){
                idx1 = i;
            }
        }
        result[0] = Math.min(idx0, idx1);
        result[1] = Math.max(idx0, idx1);

        return result;
    }

}