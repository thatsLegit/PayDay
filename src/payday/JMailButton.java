/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payday;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author cussat
 */
public class JMailButton extends JButton {
    protected int currentMail = 0;
    public static int MAXVAL=49;
    protected ImageIcon imgs[];

    public int getCurrentMail() {
        return currentMail;
    }

    public void setCurrentMail(int currentMail) {
        this.currentMail = currentMail;
        this.setIcon(imgs[currentMail]);
        this.repaint();
    }
    
    public JMailButton() {
        imgs = new ImageIcon[MAXVAL+1];
        for (int i=0; i<=MAXVAL; i++) {
            try {
                imgs[i] = new ImageIcon("resources/MailCards/MC"+i+".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
