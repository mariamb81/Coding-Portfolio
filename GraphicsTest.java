import java.awt.Color;

import hsa_ufa.Console;

public class GraphicsTest {

	static Console c = new Console(); //create a new console named c 
	
	public static void main(String[] args) {
		
		Console c1 = new Console();

		
		Console c2 = new Console();
		c1.println("Window 1");
		c2.println("Window 2");
		
		c1.setColor(Color.RED);
		c1.fillStar(0, 0, 50, 50);
		c1.setColor(Color.BLUE);
		c1.fillStar(600, 0, 50, 50);
		//c1.fillStar(0, 450, 50, 50);
		//c1.fillStar(600, 450, 50, 50);
		c1.setColor(new Color(0, 0, 255));
		c1.drawLine(100, 100, 200, 100);
		
		//c.print("Hello World");
		//c.print("How many rows are there? ");
		//c.print(c.getNumRows());
		//c.print("and how many columns?");
		//c.print(c.getNumColumns());
		c.setBackgroundColor(Color.PINK);//
		//c.clear();
	    c.print("The Console is " + c.getDrawWidth() + " pixels wide ");
	    c.print("and " + c.getDrawHeight() + " pixels high.");
	    c.setColor(Color.WHITE);
	    c.fillOval(300, 300, 200, 100);
	    c.setColor(Color.RED);
	    c.fillArc(300, 100, 200, 300, 0, 180);
		c.setColor(Color.ORANGE);
		c.fillArc(300, 120, 200, 300, 0, 180);
		c.setColor(Color.YELLOW);
		c.fillArc(300, 140, 200, 300, 0, 180);
		c.setColor(Color.GREEN);
		c.fillArc(300, 160, 200, 300, 0, 180);
		c.setColor(Color.BLUE);
		c.fillArc(300, 180, 200, 300, 0, 180);
		c.setColor(Color.CYAN);
		c.fillArc(300, 200, 200, 300, 0, 180);
		c.setColor(Color.WHITE);
		c.fillOval(300, 220, 200, 240);
		//c.setColor(new Color(100, 0, 200)); //purple
		
	}

}
