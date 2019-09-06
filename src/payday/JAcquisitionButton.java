/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payday;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author cussat
 */
public class JAcquisitionButton extends JButton {
    protected int currentAcquisition = 0;
    public static int MAXVAL = 23;
    protected ImageIcon imgs[];

    public int getCurrentAcquisition() {
        return currentAcquisition;
    }

    public void setCurrentAcquisition(int currentAcquisition) {
        this.currentAcquisition = currentAcquisition;
        this.setIcon(imgs[currentAcquisition]);
        this.repaint();
    }
    
    public JAcquisitionButton() {
        imgs = new ImageIcon[MAXVAL+1];
        for (int i=0; i<=MAXVAL; i++) {
            try {
                imgs[i] = new ImageIcon("resources/AcquisitionCards/AC"+i+".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
