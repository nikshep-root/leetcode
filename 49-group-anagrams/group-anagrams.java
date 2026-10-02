class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String sorted = sort(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
    private String sort(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        return str;
    }
}