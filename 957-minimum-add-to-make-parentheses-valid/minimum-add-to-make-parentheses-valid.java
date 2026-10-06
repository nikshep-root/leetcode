class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int addition = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    addition++;
                }
            }
        }
        return addition+open;
    }
}