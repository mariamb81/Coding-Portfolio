import hsa_ufa.Console;
import java.awt.*;

public class MouseTest {
   
   public static void main(String args[]) throws InterruptedException {
      
      Console c = new Console();
      
      int mouseClick = 0;
      
      c.enableMouse();
      c.enableMouseMotion();
      c.enableMouseWheel();
      
      while (true) {
         
         synchronized(c) {
            
            c.clear();
            
            c.setCursor(10, 10);
            c.print("Mouse pointer location: (" + c.getMouseX() + ", " + c.getMouseY() + ")");
            
            mouseClick = c.getMouseClick();
            c.setCursor(12, 10);
            c.print("Mouse clicked: " + mouseClick);
            if (mouseClick != 0)
               c.fillRect(c.getMouseX() - 10, c.getMouseY() - 10, 10, 10);
            
            c.setCursor(14, 10);
            c.print("Mouse wheel rotation: " + c.getMouseWheelRotation());
            c.setCursor(15, 10);
            c.print("Mouse wheel units to scroll: " + c.getMouseWheelUnitsToScroll());
            
            c.setCursor(17, 10);
            c.print("Mouse buttons: ");
            for (int i = 0; i < 3; i++)
               if (c.getMouseButton(i))
                  c.print(i + " ");
               else
                  c.print("  ");
            
         }
         
         Thread.sleep(250);
         
      }
      
   }
   
}