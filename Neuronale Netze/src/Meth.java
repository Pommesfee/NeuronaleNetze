import java.util.ArrayList;
import java.util.Random;

public class Meth {

	public ArrayList<int[][]> pictures = new ArrayList<int[][]>();

	public int[][] matirx = new int[64][64];

	Random r = new Random();

	public void createrandompic(int pictureCount) {

		int[][] pic = new int[8][8];

		for (int k = 0; k < pictureCount; k++) {
			for (int i = 0; i < pic.length; i++) {
				for (int j = 0; j < pic.length; j++) {
					pic[i][j] = r.nextInt(2) - 1;
				}
			}
			pictures.add(pic);
		}
	}

	public void printPicture(int[][] picm) {

		for (int i = 0; i < picm.length; i++) {
			for (int j = 0; j < picm.length; j++) {
				System.out.print(picm[i][j]);
			}
			System.out.println();
		}
	}

	public void pictovektor(int[][] pic) {

		int[] picVektor = new int[pic.length * pic.length];

		for (int i = 0; i < pic.length; i++) {
			for (int j = 0; j < pic.length; j++) {
				picVektor[j + (pic.length * i)] = pic[i][j];
			}
		}

	}

	
	
}
