class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int count[] = new int[10];
        for(int d : digits){
            count[d]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int num = 100;num<=998;num+=2){
            int d1 = num/100;
            int d2 = (num/10)%10;
            int d3 = num%10;
            int[] freq = new int[10];
            freq[d1]++;
            freq[d2]++;
            freq[d3]++;
            if(freq[d1]<=count[d1] && freq[d2]<=count[d2] && freq[d3]<=count[d3]){
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for(int i =0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}