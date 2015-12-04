package teamomega;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    
    View view ;
    Model model; 
    
    public Controller(View view, Model model) {
    
        this.view = view;
        this.model = model; 
        
        this.view.ButtonListener(new ButtonListener());
    }
    
    private class ButtonListener implements ActionListener {  
        
        @Override
        public void actionPerformed(ActionEvent e){
        
            double number = view.getNumber();
                
            try {
                double zahl = model.doAddition(number); 
                view.setSolution(zahl);
              
            } catch (Exception ex) {
                
                view.displayError();
            }
        }   
    }
}