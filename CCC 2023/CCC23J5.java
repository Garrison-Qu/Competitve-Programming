import java.io.*;

public class CCC23J5 {
    static char[][] puzzle = new char[100 + 5][100 + 5];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        String target = st.sval;
        char fl = target.charAt(0);
        st.nextToken();
        int row = (int) st.nval;
        st.nextToken();
        int col = (int) st.nval;

        boolean[][] marked = new boolean[row + 5][col + 5];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                st.nextToken();
                puzzle[i][j] = st.sval.charAt(0);
                if (puzzle[i][j] == fl) {
                    marked[i][j] = true;
                }
            }
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (marked[i][j] == true) {
                    for (int n = -1; n <= 1; n++) {
                        for (int m = -1; m <= 1; m++) {
                            if (isValid(i+n, j+m) && puzzle[i+n][j+m] == target.charAt(1)) {
                                //System.out.println((int) i+n + " " + (int) (j+m) + " " + m + " " + n);
                                //search(target.substring(1), i+n, j+m, -n, -m, false);
                                search(target.substring(1), i+n, j+m, m, n, false);
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
    
    private static void search(String str, int row, int col, int xVector, int yVector, boolean turned) {
        if (!isValid(row, col)) {
            return;
        }

        if (str.length() == 0) {
            //System.out.println("SUCCEED: " + row + " " + col + " " + xVector + " " + yVector);
            count++;
            return;
        }

        if ((puzzle[row][col] == str.charAt(str.length()-1))) {
            //System.out.println("SUCCEED: " + row + " " + col + " " + xVector + " " + yVector);
            count++;
            return;
        }

        if (!turned) {
            if (yVector == 1) {
                if (xVector == 1) {
                    //(xVector, yVector) = (1, 1)
                    if (puzzle[row + 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col+1, 1, 1, false);
                    }
                    if (puzzle[row + 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col-1, -1, 1, true);
                    }
                    if (puzzle[row - 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col+1, 1, -1, true);
                    }
                } else if (xVector == 0) {
                    //(xVector, yVector) = (0, 1)
                    if (puzzle[row + 1][col] == str.charAt(1)) {
                        search(str.substring(1), row+1, col, 0, 1, false);
                    }
                    if (puzzle[row][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row, col-1, -1, 0, true);
                    }
                    if (puzzle[row][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row, col+1, 1, 0, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row + 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col-1, -1, 1, false);
                    }
                    if (puzzle[row + 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col+1, 1, 1, true);
                    }
                    if (puzzle[row - 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col-1, -1, -1, true);
                    }
                }
            } else if (yVector == 0) {
                if (xVector == 1) {
                    if (puzzle[row][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row, col+1, 1, 0, false);
                    }
                    if (puzzle[row + 1][col] == str.charAt(1)) {
                        search(str.substring(1), row+1, col, 0, 1, true);
                    }
                    if (puzzle[row - 1][col] == str.charAt(1)) {
                        search(str.substring(1), row-1, col, 0, -1, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row, col-1, -1, 0, false);
                    }
                    if (puzzle[row + 1][col] == str.charAt(1)) {
                        search(str.substring(1), row+1, col, 0, 1, true);
                    }
                    if (puzzle[row - 1][col] == str.charAt(1)) {
                        search(str.substring(1), row-1, col, 0, -1, true);
                    }
                }
            } else {
                if (xVector == 1) {
                    if (puzzle[row - 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col+1, 1, -1, false);
                    }
                    if (puzzle[row - 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col-1, -1, -1, true);
                    }
                    if (puzzle[row + 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col+1, 1, 1, true);
                    }
                } else if (xVector == 0) {
                    //(xVector, yVector) = (0, -1)
                    if (puzzle[row - 1][col] == str.charAt(1)) {
                        search(str.substring(1), row-1, col, 0, -1, false);
                    }
                    if (puzzle[row][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row, col-1, -1, 0, true);
                    }
                    if (puzzle[row][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row, col+1, 1, 0, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row - 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col-1, -1, -1, false);
                    }
                    if (puzzle[row + 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col-1, -1, 1, true);
                    }
                    if (puzzle[row - 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col+1, 1, -1, true);
                    }
                }
            }
        //cases that have turned already            
        } else {
            if (yVector == 1) {
                if (xVector == 1) {
                    if (puzzle[row + 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col+1, 1, 1, true);
                    }
                } else if (xVector == 0) {
                    if (puzzle[row + 1][col] == str.charAt(1)) {
                        search(str.substring(1), row+1, col, 0, 1, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row + 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row+1, col-1, -1, 1, true);
                    }
                }
            } else if (yVector == 0) {
                if (xVector == 1) {
                    if (puzzle[row][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row, col+1, 1, 0, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row, col-1, -1, 0, true);
                    }
                }
            } else {
                if (xVector == 1) {
                    if (puzzle[row - 1][col + 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col+1, 1, -1, true);
                    }
                } else if (xVector == 0) {
                    if (puzzle[row - 1][col] == str.charAt(1)) {
                        search(str.substring(1), row-1, col, 0, -1, true);
                    }
                } else if (xVector == -1) {
                    if (puzzle[row - 1][col - 1] == str.charAt(1)) {
                        search(str.substring(1), row-1, col-1, -1, -1, true);
                    }
                }
            }
        }
    }

    private static boolean isValid(int row, int col) {
        if (row <= 0 || col <= 0) {
            return false;
        }
        return true;
    }
}
