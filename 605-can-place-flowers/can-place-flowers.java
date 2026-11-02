class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0;i < flowerbed.length;i++){
            if(i == 0 && flowerbed[0] == 0 && (flowerbed.length == 1 || flowerbed[1] == 0)){
                flowerbed[0] = 1;
                n--;
            }
            if(i == flowerbed.length-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
                flowerbed[flowerbed.length-1] = 1;
                n--;
            }
            if(i > 0 && i<flowerbed.length-1){
            if(flowerbed[i] == 0 && (flowerbed[i-1] ==0 && flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
            } 
        }
        return n <= 0? true : false;
    }
}