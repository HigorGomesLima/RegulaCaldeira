package regulacaldeira;
import java.util.*;
import javax.swing.JOptionPane;

public class RegulaCaldeira {


    public static void main(String[] args) {

        final VisorFogo frame = new VisorFogo();
        final VisorAgua frame2 = new VisorAgua();
        final Visor frame3 = new Visor();
        frame.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        
        frame.setLocation(580, 50);
        //frame3.setLocation(285, 50);
        frame2.setLocation(0, 50);
       final Timer timer = new Timer();
    
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if(Caldeira.getQuantAguaAtual() <= Caldeira.getMaxAgua() && Caldeira.getQuantAguaAtual() >= Caldeira.getMinAgua()){
                Caldeira.atualizarCaldeira();
                frame3.atualizar();
                }else{
                    JOptionPane.showMessageDialog(null,"Explodiu");
                    timer.cancel();
                }
            }
        }, 100, 1000);
    }
    
}
