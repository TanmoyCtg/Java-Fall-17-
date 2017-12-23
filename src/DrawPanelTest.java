//import javax.swing.JFrame;
class Pyramid{
	public int countBlocks(int levels){
    	int total = 0;
    	for (int i = 1; i <= levels; i++){
        	int x = i*i;
        	total = total + x;
        	//System.out.println(x);
    	}
    	return total;
}
}
//countBlocks();
public class DrawPanelTest {
	public static void main(String[] args){
		Pyramid p = new Pyramid();
		System.out.println(p.countBlocks(2));
	}
}