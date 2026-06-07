class Solution {
    //abcdefb
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        int c = 0;
        for(int i = 0; i < s. length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                c++;
            }
            else{
                res = Math.max(c,res);
                while(l < i){
                    if(s.charAt(l) == ch){
                        l++;
                        break;
                    }
                    else{
                        c--;
                        set.remove(s.charAt(l));
                        l++;
                    }
                    
                }
            }
        }
        return Math.max(res, c);
    }
}
