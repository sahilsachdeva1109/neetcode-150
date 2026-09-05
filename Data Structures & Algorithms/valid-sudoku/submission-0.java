class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize all sets 
        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        //Traverse the board

        for(int r=0 ; r < 9 ; r++){
            for(int c = 0 ; c<9 ; c++){
                // Ignore empty cells
                if(board[r][c]=='.'){
                    continue;
                }

                char num = board[r][c];

                // Find which 3*3 box this cell belongs to 
                int boxIndex = (r/3)*3 +(c/3);

                // check duplicate
                if(rows[r].contains(num)|| cols[c].contains(num) || boxes[boxIndex].contains(num)){
                    return false;
                }

                // Add number to all three

                rows[r].add(num);
                cols[c].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;

    }
}
