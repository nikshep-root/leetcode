class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x = Math.max(x1,Math.min(xCenter,x2));
        int y = Math.max(y1,Math.min(yCenter,y2));
        int xDiff = xCenter - x;
        int yDiff = yCenter - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff) <= radius;
    }
}