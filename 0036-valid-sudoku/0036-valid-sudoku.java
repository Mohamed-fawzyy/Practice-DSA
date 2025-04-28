class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        int n = board.length;
        int counter = 0;

        for (int r=0; r < n; r++){
            for (int c=0; c < n; c++){

                if(board[r][c] == '.') continue;

                String sqrKey = (r/3) + "," + (c/3);

                if ( row.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                     col.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                     square.computeIfAbsent(sqrKey, k -> new HashSet<>()).contains(board[r][c])
                ) {return false;};

                row.get(r).add(board[r][c]);
                col.get(c).add(board[r][c]);
                square.get(sqrKey).add(board[r][c]);
            }
        }
        return true;
    }
}