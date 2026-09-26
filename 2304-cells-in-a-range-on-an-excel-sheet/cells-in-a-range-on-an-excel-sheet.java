class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char startingcol = s.charAt(0);
        char endingcol = s.charAt(3);
        char startingrow = s.charAt(1);
        char endingrow = s.charAt(4);
        for(char i = startingcol;i<=endingcol;++i){
            for(char j = startingrow;j<=endingrow;++j){
                list.add("" + i + j);
            }
        }
        return list;
    }
}