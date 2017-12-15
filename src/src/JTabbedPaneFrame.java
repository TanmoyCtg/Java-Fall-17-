import javax.swing.*;

public class JTabbedPaneFrame extends JFrame{
    JFrame f;
    public JTabbedPaneFrame(){
        super("JTabbedPane Demo");
        JTextArea ta = new JTextArea(300,300);
        JPanel p1 = new JPanel();
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        f.add(tp);
    }
}
