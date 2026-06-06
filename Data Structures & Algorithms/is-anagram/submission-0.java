class Solution {
    public boolean isAnagram(String s, String t) {
        if(!(s.length() == t.length())){
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        
        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            int curr1 = ch1 - 97;
            int curr2 = ch2 - 97;
            arr1[curr1] += 1;
            arr2[curr2] += 1;
        }
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
}
