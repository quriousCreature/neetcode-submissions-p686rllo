class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int rows, cols;
        rows = image.length;
        cols = image[0].length;

        Queue<int []> q = new LinkedList<>();
        boolean [][] visited = new boolean[rows][cols];

        q.add(new int[]{sr, sc});
        
        int prev = image[sr][sc];

        while(q.size() > 0) {
            // size at this level 
            int len = q.size();

            // for each element of this level
            for(int i=0; i<len; i++) {
                int [] cor = q.poll();
                int r = cor[0];
                int c = cor[1];

                // boundary check
                if (r < 0 || c < 0 || r >= rows || c >= cols ||
                 visited[r][c] == true ) continue;
                if(image[cor[0]][cor[1]] == prev) { // has previous color
                    image[cor[0]][cor[1]] = color;

                    visited[r][c] = true;

                    q.offer(new int [] {r+1, c});
                    q.offer(new int [] {r-1, c});
                    q.offer(new int [] {r, c+1});
                    q.offer(new int [] {r, c-1});
                }

            }
        }

        return image;
    }
}