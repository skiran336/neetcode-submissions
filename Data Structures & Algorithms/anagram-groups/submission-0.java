class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i =0; i < strs.length; i++){
            String curr = strs[i];
            char[] chars = curr.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted)){
                ArrayList<String> list = new ArrayList<>();
                list.add(curr);
                map.put(sorted, list);
            }
            else{
                ArrayList<String> list1 = map.get(sorted);
                list1.add(curr);
                map.put(sorted, list1);
            }
        }
        for(String str : map.keySet()){
            ArrayList<String> list = map.get(str);
            result.add(list);
        }
        return result;
    }
}
