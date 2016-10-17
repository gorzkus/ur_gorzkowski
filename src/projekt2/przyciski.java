package projekt2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class przyciski extends JFrame {
    
    public przyciski(){
    pokazGui();
    
    }; 
    
  private void pokazGui(){
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container contentPane = getContentPane();
     contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      
     JPanel panel = new JPanel(new FlowLayout());
     JPanel panel2 = new JPanel(new FlowLayout());
     JLabel label = new JLabel("Imie: ");
     JLabel label2 = new JLabel("Nazwisko: ");
 
     label.setDisplayedMnemonic(KeyEvent.VK_N);
     
     JTextField textField = new JTextField("",15);
     JTextField textField2 = new JTextField("",15);
     textField.setHorizontalAlignment(JTextField.CENTER);
    
//wyswietlanie komunikatu 
     /* textField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Witam" + textField.getText() + "!!!");
             
         }
     }); */
     
     /*
     label.setLabelFor(textField);
     panel.add(label,BorderLayout.WEST);
     panel.add(textField, BorderLayout.CENTER);
     add(panel, BorderLayout.NORTH);
     setSize(350,150);
     */
      /*
     label2.setLabelFor(textField2);
     panel2.add(label2,BorderLayout.WEST);
     panel2.add(textField2, BorderLayout.CENTER);
     add(panel2, BorderLayout.NORTH);
     setSize(250,150);
     */    
     add(label);
     add(textField);
     add(panel);
     pack();
     
     
     add(label2);
     add(textField2);
     
     pack();
     

  
     
         
     }
    
    
    
    
    
    
    
    
}
