/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInformation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class UserInfo extends Subject implements Information, Observer {
    private String id;
    private List <Information> watchList;
    private List <String> messages;

    public UserInfo (String s) {
        id = s;
        watchList = new ArrayList <Information> ();
        messages = new ArrayList <String> ();
        observers.add(this);
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

    @Override
    public List<Information> getWatchlist() {
        return watchList;
    }
}
