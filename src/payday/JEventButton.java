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
public class JEventButton extends JButton {
    protected int currentEvent = 0;
    public static int MAXVAL = 23;
    protected ImageIcon imgs[];

    public int getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(int currentEvent) {
        this.currentEvent = currentEvent;
        this.setIcon(imgs[currentEvent]);
        this.repaint();
    }
    
    public JEventButton() {
        imgs = new ImageIcon[MAXVAL+1];
        for (int i=0; i<=MAXVAL; i++) {
            try {
                imgs[i] = new ImageIcon("resources/EventCards/EC"+i+".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
