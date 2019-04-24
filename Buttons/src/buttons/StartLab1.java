

package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class StartLab1 {
  public JPanel panel2(){
  JPanel start = new JPanel();
  JTextPane result = new JTextPane(); 
  JButton button1 = new JButton("Start Lab1");
  button1.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent ae) {
          
          throw new UnsupportedOperationException("Not supported yet."); 
      }
  });
  start.add(button1);
  return start;
  }
    
}
