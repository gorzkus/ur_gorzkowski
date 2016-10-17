package projekt2;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ramkaGrid extends JFrame {
    
    public ramkaGrid(){
    pokazGui();
    
    }; 
    
  private void pokazGui(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container contentPane = getContentPane();
     contentPane.setLayout(new GridBagLayout());
      
     GridBagConstraints gbc = new GridBagConstraints();
     
     for (int i = 0; i<3; i++){
         
         gbc.gridx = i;
         gbc.gridy = i;
         contentPane.add(new JButton("Button (" + i + ")"), gbc);
         
         
     }
     
     for(int y = 3; y <6; y++) {
         
         for(int x = 3; x < 6; x++) {
             gbc.gridx = x;
             gbc.gridy = y;
                contentPane.add(new JButton("Button (" + x + ", " + y + ")"), gbc);
                
         }
         
     }
     
     
     
     
     pack();
     setVisible(true);
     setBounds(100, 100, 800, 800);  
         
     }
    
    
    
    
    
    
    
    
}