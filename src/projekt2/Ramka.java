package projekt2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ramka extends JFrame {

    public Ramka(){
    pokazGui();
    
    }; 
    
  private void pokazGui(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel buttonPanel = new JPanel(new BorderLayout());
        
        
        JButton northButton = new JButton("Polnoc");
       
        
        
        JButton southButton = new JButton("Poludnie");
        JButton eastButton = new JButton("Wschod");
        JButton westButton = new JButton("Zachod");
        JButton srodeczekButton = new JButton("Srodeczek");
                         
                    
        
        buttonPanel.add(northButton, BorderLayout.NORTH);
        buttonPanel.add(southButton, BorderLayout.SOUTH);
        buttonPanel.add(eastButton, BorderLayout.EAST);
        buttonPanel.add(westButton, BorderLayout.WEST);
        buttonPanel.add(srodeczekButton, BorderLayout.CENTER);
        
        
        
         northButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "JINX PINX!");
            }
        }
        );
        
             
        
        
        
            
        
     
        
        
        
        
        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setBounds(100, 100, 300, 300);     
       
       
   };
        
    }
    
