class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        def backtracking(i, j, k):
            if k==len(word):
                return True

            if i < 0 or i >= len(board) or j < 0 or j >= (len(board[0])) or board[i][j] != word[k]:
                return False
            
            temp = board[i][j]
            board[i][j] = ''

            if backtracking(i+1,j,k+1) or backtracking(i-1,j,k+1) or backtracking(i,j+1,k+1) or backtracking(i,j-1,k+1):
                return True

            board[i][j] = temp
            return False
        
        for i in range(len(board)):
            for j in range(len(board[i])):
                if backtracking(i, j, 0):
                    return True
        return False
        