/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInformation;

import static UI.AdminFrame.getAdminFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */

//User info that holds all information. UserInfo is a subject AND observer
public class UserInfo extends Subject implements Information, Observer {
    private String id;
    private List <Information> watchList;
    private List <String> messages;

    public UserInfo (String s) {
        id = s;
        watchList = new ArrayList <Information> ();
        messages = new ArrayList <String> ();
        observers.add(this);
        timeCreated = System.currentTimeMillis();
    }
    public String getID() {
        return id;
    }

    @Override
    public List<String> getMessages() {
        return messages;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof Tweet) {
            messages.add(((Tweet) subject).getMessage());
        }
    }
    //Will notify all observers to update and get new info
    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(this);
        }
    }
    //Will push the message to all observers of thread
    public void notifyObservers (String message) {
        Tweet tweet = new Tweet (message);
        for (Observer ob : observers) {
            ob.update(tweet);
        }
        getAdminFrame().setLastUpdatedUser(this);
    }
    @Override
    public List<Information> getWatchlist() {
        return watchList;
    }
}
