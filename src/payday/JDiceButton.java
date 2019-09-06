/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payday;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author cussat
 */
public class JDiceButton extends JButton {
    protected int value = 1;
    protected ImageIcon imgs[];
    public static int MAXVAL = 6;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.setIcon(imgs[value-1]);
        this.repaint();
    }
    
    public JDiceButton() {
        super();
        imgs = new ImageIcon[6];
        for (int i=0; i<6; i++) {
            try {
                imgs[i] = new ImageIcon("resources/Dice/D"+(i+1)+".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
            
        
}
