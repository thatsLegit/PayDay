package payday;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cussat
 */
public class JBoardBox extends javax.swing.JPanel {
    public enum CaseType {
        Acquisition,
        Anniversary,
        Crafting,
        Errands,
        Concours,
        Mail1,
        Mail2,
        Mail3,
        Start,
        Sunday,
        Event,
        PayDay,
        Lotery,
        ChangeHour,
        Shopping,
        Stroll,
        Sell        
    };

    protected Image img;
    protected Boolean player1 = false;
    protected Boolean player2 = false;
    protected Boolean player3 = false;
    protected Boolean player4 = false;
    protected int dayNumber = 0;
    protected CaseType type;
    
    private static int tokenSize = 30;
    private static int tokenSpacing = 2;
    
    
    
    /**
     * Creates new form JBoardCase
     */
    public JBoardBox() {
        initComponents();
    }
    
    public JBoardBox(int dayNumber, CaseType type) {
        this.dayNumber = dayNumber;
        this.type = type;
        String imgName = "resources/BoardBoxes/BB"+dayNumber+".png";
        try {
            img = ImageIO.read(new File(imgName));
        } catch (IOException e) {
            System.err.println("Well, its here "+imgName);
            e.printStackTrace();
        }
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
            .addGap(0, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_FAST), 0, 0, null);
        }
        if (player1) {
            g.setColor(JBoardFrame.PLAYER_ONE_COLOR);
            g.fillOval(74-tokenSize-tokenSpacing, 74-tokenSize-tokenSpacing, tokenSize, tokenSize);
            g.setColor(Color.BLACK);
            g.drawOval(74-tokenSize-tokenSpacing, 74-tokenSize-tokenSpacing, tokenSize, tokenSize);
        }
        if (player2) {
            g.setColor(JBoardFrame.PLAYER_TWO_COLOR);
            g.fillOval(74+tokenSpacing, 74-tokenSize-tokenSpacing, tokenSize, tokenSize);
            g.setColor(Color.BLACK);
            g.drawOval(74+tokenSpacing, 74-tokenSize-tokenSpacing, tokenSize, tokenSize);
        }
        if (player3) {
            g.setColor(JBoardFrame.PLAYER_THREE_COLOR);
            g.fillOval(74-tokenSize-tokenSpacing, 74+tokenSpacing, tokenSize, tokenSize);
            g.setColor(Color.BLACK);
            g.drawOval(74-tokenSize-tokenSpacing, 74+tokenSpacing, tokenSize, tokenSize);
        }
        if (player4) {
            g.setColor(JBoardFrame.PLAYER_FOUR_COLOR);
            g.fillOval(74+tokenSpacing, 74+tokenSpacing, tokenSize, tokenSize);
            g.setColor(Color.BLACK);
            g.drawOval(74+tokenSpacing, 74+tokenSpacing, tokenSize, tokenSize);
        }
    }

    public Boolean getPlayer1() {
        return player1;
    }

    public void setPlayer1(Boolean player1) {
        this.player1 = player1;
        repaint();
    }

    public Boolean getPlayer2() {
        return player2;
    }

    public void setPlayer2(Boolean player2) {
        this.player2 = player2;
        repaint();
    }

    public Boolean getPlayer3() {
        return player3;
    }

    public void setPlayer3(Boolean player3) {
        this.player3 = player3;
        repaint();
    }

    public Boolean getPlayer4() {
        return player4;
    }

    public void setPlayer4(Boolean player4) {
        this.player4 = player4;
         repaint();
   }

    public int getDayNumber() {
        return dayNumber;
    }

    public Image getImg() {
        return img;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
