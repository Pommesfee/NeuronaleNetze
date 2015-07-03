import java.util.ArrayList;
import java.util.Random;

public class Meth {

	public ArrayList<int[][]> pictures = new ArrayList<int[][]>();
	public ArrayList<int[]> picvectors = new ArrayList<int[]>();
	
	public ArrayList<int[][]> weightMatrices= new ArrayList<int[][]>();
	
	public int[][] finalMatrix = new int[64][64];

	Random r = new Random();

	public void createrandompic(int pictureCount) {

		int[][] pic = new int[8][8];

		for (int k = 0; k < pictureCount; k++) {
			for (int i = 0; i < pic.length; i++) {
				for (int j = 0; j < pic.length; j++) {
					int rnd;
					rnd = r.nextInt(2);
					if (rnd == 0) {
						pic[i][j] = -1;
					} else {
						pic[i][j] = rnd;
					}
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
			picvectors.add(picVektor);
		}

	}

	public void weightMatrix(int[] picVektor) {

		int[][] matrix = new int[picVektor.length][picVektor.length];

		for (int i = 0; i < picVektor.length; i++) {
			for (int j = 0; j < picVektor.length; j++) {

				if (i == j) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = picVektor[i] * picVektor[j];
				}
			}
		}
	 weightMatrices.add(matrix);

	}

	public void finalMatrix (ArrayList<int[][]> matrices){
		
		for (int i = 0; i < matrices.size(); i++) {
			for (int j = 0; j < finalMatrix.length; j++) {
				for (int j2 = 0; j2 < finalMatrix.length; j2++) {
					finalMatrix[j][j2]
							,
				}
			}
		}
		
	}

}
