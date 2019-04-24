

package buttons;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Buttons {

   
    public static void main(String[] args) {
        MainFrame frame  = new MainFrame();
        JPanel data = new JPanel(new GridLayout(2,2));
        JPanel buttons = new JPanel(new GridLayout(3,3));
        JTabbedPane tabbed = new JTabbedPane();
        JPanel mainPanel = new JPanel(new GridLayout(5,5));
        mainPanel.add(data);
        mainPanel.add(buttons);
       
        frame.add(tabbed);     
                
        data.add(new JLabel("Name:", SwingConstants.CENTER));
        data.add(new JTextField("Name 1"));
        data.add(new JLabel("Opponent:", SwingConstants.CENTER));
        data.add(new JTextField("Name 2"));
        
        for (int i = 0; i < 9; i++){
            JButton button = new JButton("-") ;
            buttons.add(button);
        }
        tabbed.add("Games", mainPanel);
        StartLab1 task = new StartLab1();
        tabbed.add("Task", task.panel2());
        
        
        
       
        //tabbed.addTab("Game", buttons);
        
        
        frame.pack();
        
   
    
    
    
    
    }
    
    
    
    
}
