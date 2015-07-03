import javax.swing.JApplet;


public class Main extends JApplet {

	public static void main(String[] args) {
		
		Meth meth = new Meth();
		
		meth.createrandompic(2);
		
		meth.printPicture(meth.pictures.get(0));
	
		System.out.println();

		meth.pictovektor(meth.pictures.get(0));
		
	}
	
	
	public Main() {
		
	}

}
