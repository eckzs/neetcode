class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        cols = [[] for _ in range(9)]
        grid = [[] for _ in range(9)]

        for idx_y, row in enumerate(board):
            row_values = []

            for idx_x, x in enumerate(row):
                if x == ".":
                    continue

                grid_n = (idx_y // 3) * 3 + (idx_x // 3)

                if (
                    x in row_values
                    or x in cols[idx_x]
                    or x in grid[grid_n]
                ):
                    return False

                row_values.append(x)
                cols[idx_x].append(x)
                grid[grid_n].append(x)

        return True

if __name__ == "__main__":
    board = [["1","2",".",".","3",".",".",".","."],
            ["4",".",".","5",".",".",".",".","."],
            [".","9","8",".",".",".",".",".","3"],
            ["5",".",".",".","6",".",".",".","4"],
            [".",".",".","8",".","3",".",".","5"],
            ["7",".",".",".","2",".",".",".","6"],
            [".",".",".",".",".",".","2",".","."],
            [".",".",".","4","1","9",".",".","8"],
            [".",".",".",".","8",".",".","7","9"]]

    # expected: true

    s = Solution()
    print(s.isValidSudoku(board))