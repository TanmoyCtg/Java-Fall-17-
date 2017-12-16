import javax.swing.JFrame;

public class GUIMain {

	public static void main(String [] args)
	{
		MyFrame f = new MyFrame();
		f.addComponentsToFrame();
		f.testAnnonymousClass();
		f.setVisible(true);
	}
}
