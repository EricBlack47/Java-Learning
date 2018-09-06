package freework;

public class HorseStepTest {
    //��һ������8��λ��
	private static int[][] nextPos = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 },{ -2, -1 } };
	private static int total = 0;
	//��һ��λ��
	static int prePosX;
	static int prePosY;

	public static void main(String[] args) {
		int[][] chessBoard = new int[8][8];
		int startX = 0;
		int startY = 0;
		chessBoard[startX][startY] = 1;		
		find(startX, startY, 2, chessBoard);
}
	private static void find(int x, int y, int dep, int[][] chessBoard) {
		int i, xx, yy;
		for (i = 0; i <=7; i++) {
			xx = x+nextPos[i][0];
			yy = y+nextPos[i][1];
			// �ж��Ƿ�Խ������
			if (isInBoard(xx, yy) && chessBoard[xx][yy] == 0) {
				chessBoard[xx][yy] = dep;
				if (dep == 64) {
					total++;
					printChessBoard(chessBoard);
					System.out.println("--------------------");
					System.out.println(total);
				} else {
					//��������������ݹ���һ��
					find(xx, yy, dep + 1, chessBoard);
				}
				//���ݣ��ָ�δ��λ��
				chessBoard[xx][yy] = 0;
			}
		}
	}

	// �������
	private static void printChessBoard(int[][] chessBoard) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(chessBoard[i][j] + "\t");
			}		
			System.out.println();
		}
	}
	// �ж��Ƿ�Խ��
	private static boolean isInBoard(int posX, int posY) {
		return 0 <= posX && posY < 8 && 0 <= posY && posX < 8;
	}
}