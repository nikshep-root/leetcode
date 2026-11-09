class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> list = new ArrayList<>();
        int i = 0;
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
                continue;
            }
            int j = i;
            while(j<s1.length() && s1.charAt(j) != s2.charAt(j)){
                j++;
            }
                String sub1 = s1.substring(i,j);
                String sub2 = s2.substring(i,j);
                List<String> subList = new ArrayList<>();
                subList.add(sub1);
                subList.add(sub2);
                list.add(subList);
                i = j;
        }
        return list;
    }
}