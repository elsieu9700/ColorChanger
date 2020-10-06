import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Colorchange extends JFrame {//Calls JFrame Library
	
public Colorchange() {
    	setTitle("Change Color on click");// Title
    	setSize(500,500);
    	MyPanel pane=new MyPanel();
    	add(pane);
	}
	public static void main(String[] args) {
    	Colorchange ob=new Colorchange();
    	ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ob.setVisible(true);
	}
	
}
class MyPanel extends JPanel {
	int x=200,y=200,r=50;
	Color co=Color.BLUE;//Change Color
	
public MyPanel() {
	addMouseListener(new MouseAdapter() {
    	public void mouseClicked(MouseEvent me) {
        	if(me.getX() >= (x-r) && me.getX() < (x+r) && me.getY() >= (y-r) && me.getY() < (y+r)) {
            	co=Color.ORANGE;//Change Color
            	repaint();
        	}
    	}
	});
}
	public void paintComponent(Graphics g) {
    	g.setColor(co);
    	g.fillOval(x-r, y-r, 2*r, 2*r);//Creates circle
	}
}
