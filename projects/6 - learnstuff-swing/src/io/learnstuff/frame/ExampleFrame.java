package io.learnstuff.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExampleFrame extends JFrame {
	
	public ExampleFrame(String title) {
		super(title);
		this.setSize(300, 300);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		
		JButton button = new JButton();
		button.setText("Example button");
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Some other text!");
            }
        });    
		
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
	}

}
