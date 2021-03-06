/*
 *
 * Projeto (projeto_lp2_1516) - Linguagens de Programaçao 2
 * 
 * edu.ufp.inf.lp2.project.gui
 * DrawPanel.java
 *
 * 2015/2016 (c) Universidade Fernando Pessoa
 *
 */
package edu.ufp.inf.lp2.project.gui;

import edu.ufp.inf.lp2.project.Network;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author tiagocardoso
 */
public class DrawPanel extends javax.swing.JPanel {

    protected Network network;
    
    /**
     * Creates new form DrawPanel
     */
    public DrawPanel() {
        this.network = null;
        this.network = AppMainJFrame.getNetwork();
        if(this.network == null) {
            System.out.println("Network not instanced!");
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = super.getWidth();
        int h = super.getHeight();
        
        Image offScreenImage = super.createImage(w,h);
        Graphics offscreenGraphics = offScreenImage.getGraphics();
        offscreenGraphics.setColor(super.getBackground());
        offscreenGraphics.fillRect(0, 0, w, h);
        
        this.network.draw(w,h,offscreenGraphics);
        g.drawImage(offScreenImage,0,0,null);
        super.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
