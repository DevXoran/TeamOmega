package teamomega;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
    private JFrame frame;
    private JPanel panel;
    private JTextField input;
    private JTextField output;
    private JButton button;
    
    
    
    public View(){
        createFrame();
        createPanel();
        createInput();
        createOutput();
        createButton();
        
        frame.add(panel);
        panel.add(output);
        panel.add(input);
        panel.add(button);
        frame.pack();
        
        
    }
    
    private void createFrame(){
        frame=new JFrame("Guenther");
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private void createPanel(){
        panel=new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
    }
    
    private void createInput(){
        input=new JTextField("Input");
        input.setHorizontalAlignment(JTextField.RIGHT);
    }
    
    private void createOutput(){
        output=new JTextField("Output");
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setEditable(false);
    }

    private void createButton(){
        button=new JButton("Button");
    }

    public Double getNumber(){
        String text;
        text = input.getText();
        double number = Double.parseDouble(text);  
        return number;  
    }
    
    public void setSolution(Double zahl) {
        
        String ausgabe = String.valueOf(zahl);
        output.setText(ausgabe);
    }
    
    public void displayError() {
        
        output.setText("Enter valid Number");
    }

          
}