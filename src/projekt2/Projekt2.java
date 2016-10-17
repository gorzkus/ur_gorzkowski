package projekt2;

import java.awt.BorderLayout;
import javax.swing.*;

public class Projekt2 {

     public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        przyciski app = new przyciski();
       
        app.setVisible(true);
      }
    });
  }
      
    
    
    
}
