package teamomega;

import java.awt.event.ActionListener;

public class Controller {
    
    View view ;
    Model model; 
    
    public Controller(View view, Model model) {
    
        this.view=view;
        this.model=model; 
        
        this.view.addListener(new ButtonListener());
}
    
    public void ButtonListener implements ActionListener {
        
        @Override 
        
        public void actionPerformed(ActionEvent e){
        
        double zahl;
                number = view.getNumber();
                
         try {
             double zahl = model.doAddition(zahl); 
             view.setSolution(number);
         }
    }
    }

}
