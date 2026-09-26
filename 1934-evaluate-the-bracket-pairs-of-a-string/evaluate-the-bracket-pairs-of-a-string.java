class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb= new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        int i =0;
        int n = s.length();
        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                int j= i+1;
                while (j<n && s.charAt(j)!=')') {
                    j++;
                }
                String key = s.substring(i+1,j);
                sb.append(map.getOrDefault(key,"?"));
                i = j + 1;
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}