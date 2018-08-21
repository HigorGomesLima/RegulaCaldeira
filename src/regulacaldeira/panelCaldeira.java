
package regulacaldeira;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class panelCaldeira extends javax.swing.JPanel {

    private Canvas agua = new Canvas();
    private Canvas aguaIN = new Canvas();

        
    public panelCaldeira() {
        initComponents();
        this.setOpaque(false);
        agua.setBackground(Color.blue);
        agua.setSize(210, 10);
        agua.setLocation(56, 330);
        aguaIN.setBackground(Color.blue);
        aguaIN.setSize(55,20);
        aguaIN.setLocation(0, 57);
        
        add(aguaIN);
        add(agua);
    }
    
    public void atualizar(int a,int t,int i){
        //max size 265 = 130 L
        //max agua IN = 
        int tAgua = (265/130)*a;
        int sAgua = 338 - tAgua;
        int tAguaIN = i;
        int sAguaIN = 57 - tAguaIN;
        agua.setLocation(56, sAgua);
        agua.setSize(210, tAgua);
        aguaIN.setLocation(0, sAguaIN);
        aguaIN.setSize(55, tAguaIN);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        try {
            ImageIcon aux = new ImageIcon(getClass().getResource("caldeira_vazia.png"));
            Image img = aux.getImage();
            g.drawImage(img, 0, 0, this);
            
            
            g.drawImage(fogo,130,380,80,80,this);
        } catch (Exception e) {
            System.out.printf("Erro");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
