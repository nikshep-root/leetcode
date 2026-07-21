class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1') ones++;
        }
        List<Integer> zeroBlocks = new ArrayList<>();
        int currentZeros = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '0') currentZeros++;
            else{
                if (currentZeros > 0) {
                    zeroBlocks.add(currentZeros);
                    currentZeros = 0;
                }
            }
        }
        if (currentZeros > 0) {
            zeroBlocks.add(currentZeros);
        }
        int maxDelta = 0;
        for(int i =0;i<zeroBlocks.size()-1;i++){
            maxDelta = Math.max(maxDelta,zeroBlocks.get(i)+zeroBlocks.get(i+1));
        }
        return ones + maxDelta;
    }
}