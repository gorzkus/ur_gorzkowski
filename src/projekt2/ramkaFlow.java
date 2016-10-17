package projekt2;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ramkaFlow extends JFrame {
    
    public ramkaFlow(){
    pokazGui();
    
    }; 
    
  private void pokazGui(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container contentPane = getContentPane();
     contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      
     for (int i = 1; i <=5; i++){
         contentPane.add(new JButton("Przycisk " + i));
     }
     
     
     
     
     
     
     
     
     
     pack();
     setVisible(true);
     setBounds(100, 100, 300, 300);  
         
     }
    
    
    
    
    
    
    
    
}
