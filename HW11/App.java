public class App {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // check if new color is same as source color
        if(image[sr][sc] == color) return image;
        // run fill helper
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int color, int cur) {
        // check if sr and sc are valid
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        // if new pixel isn't the same as the old color, don't do anything
        if(cur != image[sr][sc]) return;
        // if it is, change it to the new color
        image[sr][sc] = color;
        // recusively call each adjacent pixel
        fill(image, sr-1, sc, color, cur);
        fill(image, sr+1, sc, color, cur);
        fill(image, sr, sc-1, color, cur);
        fill(image, sr, sc+1, color, cur); 
    }
}
