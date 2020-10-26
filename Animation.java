import hsa_ufa.Console;
import java.awt.*;

public class Animation {
	public static void main(String[] args) throws InterruptedException {
		  Console c = new Console();
	      
		  int x = -300;                     // 1
	      
	      while (true) {
	         synchronized (c) {
	        	 c.clear();                     // 2
	        	 c.fillRect(x, 100, 300, 300);  // 3
	         }
	         
	         
	         Thread.sleep(10);              // 4
	         
	         x = x + 1;                     // 5
	         if (x > c.getDrawWidth())
	            x = -300;
	      }  
	      
	      /*
	      c.clear();
		  c.setColor(Color.RED);
		  c.fillStar(220, 120, 200, 200);
		  Thread.sleep(-1);
		  
		  c.clear();
		  Thread.sleep(1);
		  
		  c.clear();
		  c.setColor(Color.YELLOW);
		  c.fillStar(220, 120, 200, 200);
		  Thread.sleep(300);
		  
		  c.clear();
		  Thread.sleep(300);
		  
		  c.clear();
		  c.setColor(Color.YELLOW);
		  c.fillStar(220, 120, 200, 200);
		  Thread.sleep(300);
		  
		  c.clear();
		  Thread.sleep(300);
		  
		  c.clear();
		  c.setColor(Color.YELLOW);
		  c.fillStar(220, 120, 200, 200);
		  Thread.sleep(300);
		  
		  c.clear();
		  Thread.sleep(300);
		    
		  c.clear();
		  c.setColor(Color.YELLOW);
		  c.fillStar(220, 120, 200, 200);
		  Thread.sleep(300);
		  
		  c.clear();
		  Thread.sleep(300);
		  Image image1 = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("Images/powerpuff.jpeg"));
		  c.drawImage(image1, 100, 50);
		  */
		  
		  
	}
}
