/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitwitter;

import UI.AdminFrame;
import static UI.AdminFrame.getAdminFrame;
import UI.UserViewFrame;

/**
 *
 * @author Andrew
 */

//Driver method.
public class MiniTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminFrame adminFrame = getAdminFrame();
        adminFrame.setVisible(true);
    }
    
}
