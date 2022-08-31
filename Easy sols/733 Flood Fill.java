class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return(image);
        }
        Fill(image, sr, sc, color, image[sr][sc]);
        return(image);
    }
    private void Fill(int[][] image, int sr, int sc, int color, int oldcolor){
        if(sr<0 || sc < 0 || sr>=image.length || sc>= image[0].length || image[sr][sc] != oldcolor){
            return;
        }
        image[sr][sc] = color;
        Fill(image, sr+1, sc, color, oldcolor);
        Fill(image, sr-1, sc, color, oldcolor);
        Fill(image, sr, sc+1, color, oldcolor);
        Fill(image, sr, sc-1, color, oldcolor);
    }
}