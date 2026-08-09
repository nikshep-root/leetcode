class Solution {
    public int minSetSize(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Map<Integer,Integer> counts = new HashMap<>();
        for(int num : arr){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        List<Integer> freq= new ArrayList<>(counts.values());
        freq.sort(Collections.reverseOrder());
        int removed=0;
        int setSize=0;
        int target= (arr.length+1)/2;
        for(int fre : freq){
            removed+=fre;
            setSize++;
            if(removed>=target){
                break;
            }
        }
        return setSize;
    }
}