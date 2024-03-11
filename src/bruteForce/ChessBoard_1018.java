package bruteForce;

import java.util.Scanner;
public class ChessBoard_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            board[i] = row.toCharArray();
        }

        // 최소 개수 계산 및 출력
        int result = countRepaints(board);
        System.out.println(result);

        scanner.close();
    }

    private static int countRepaints(char[][] board) {
        int repaintCounts = Integer.MAX_VALUE;

        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[0].length - 8; j++) {
                int repaintCount = calculateRepaints(board, i, j);
                repaintCounts = Math.min(repaintCounts, repaintCount);
            }
        }

        return repaintCounts;
    }

    private static int calculateRepaints(char[][] board, int startX, int startY) {
        int repaintCount = 0;

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                int currentX = startX + x;
                int currentY = startY + y;

                if ((board[startX][startY] == 'B' && (x + y) % 2 == 0) ||
                        (board[startX][startY] == 'W' && (x + y) % 2 == 1)) {
                    if (board[currentX][currentY] != 'B') {
                        repaintCount++;
                    }
                } else {
                    if (board[currentX][currentY] != 'W') {
                        repaintCount++;
                    }
                }
            }
        }

        return Math.min(repaintCount, 64 - repaintCount);
    }
}
