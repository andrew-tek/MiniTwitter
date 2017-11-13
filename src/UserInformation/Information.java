/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInformation;

import java.util.List;

/**
 *
 * @author Andrew
 */

//Interface for general info needed for twitter
public interface Information {
    String getID();
    List <Information> getWatchlist();
    List <String> getMessages();
}
