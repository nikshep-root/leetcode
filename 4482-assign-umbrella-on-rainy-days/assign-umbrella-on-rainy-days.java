class Solution {
    public String[] assignUmbrella(int[] rain) {
        int alice = 0;
        int bob = 0;
        String ans[] = new String[rain.length];
        int n = rain.length;
        for(int i =0;i<rain.length;i++){
            boolean aliceNeeds = (i < n-1) && (rain[i] == 1 && rain[i+1] == 1);
            boolean bobNeeds = (rain[i] == 1);
            if(aliceNeeds && bobNeeds){
                if(alice <= bob){
                    ans[i] = "Alice";
                    alice++;
                } 
                else{
                    ans[i] = "Bob";
                    bob++;
                }
            }
            else if(bobNeeds){
                ans[i] = "Bob";
                bob++;
            }
            else{
                ans[i] = "None";
            }
        }
        return ans;
    }
}