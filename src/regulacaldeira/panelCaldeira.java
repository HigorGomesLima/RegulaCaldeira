
package regulacaldeira;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class panelCaldeira extends javax.swing.JPanel {

    private Canvas agua = new Canvas();

        
    public panelCaldeira() {
        initComponents();
        this.setOpaque(false);
        agua.setBackground(Color.blue);
        agua.setSize(210, 10);
        agua.setLocation(56, 330);
        
        add(agua);
    }
    
    public void atualizar(int a,int t){
        //max size 265 = 130 L
        //min size 10
        int tAgua = (265/130)*a;
        int sAgua = 338 - tAgua;
        agua.setLocation(56, sAgua);
        agua.setSize(210, tAgua);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        try {
            ImageIcon aux = new ImageIcon(getClass().getResource("caldeira_vazia.png"));
            Image img = aux.getImage();
            g.drawImage(img, 0, 0, this);
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
