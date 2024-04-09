def fill(self, image, sr, sc, color, cur):
    # check if sr and sc are valid
    if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]): return;
    # if new pixel isn't the same as the old color, don't do anything
    if cur != image[sr][sc]: return;
    # if it is, change it to the new color
    image[sr][sc] = color;
    # recusively call each adjacent pixel
    self.fill(image, sr-1, sc, color, cur);
    self.fill(image, sr+1, sc, color, cur);
    self.fill(image, sr, sc-1, color, cur);
    self.fill(image, sr, sc+1, color, cur);
def floodFill(self, image, sr, sc, color):
    # check if new color is same as source color
    if image[sr][sc] == color: return image;
    # run fill helper
    self.fill(image, sr, sc, color, image[sr][sc]);
    return image;