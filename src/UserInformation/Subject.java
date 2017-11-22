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

//Subject for observer pattern
public abstract class Subject {
    long lastUpdate;
    long timeCreated;
    List <Observer> observers = new ArrayList<Observer>();
    public void attach (Observer observer) {
        observers.add(observer);
    }
    public void detatch (Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(this);
        }
    }
        public long getTimeCreated() {
        return timeCreated;
    }
    private void setTimeCreated (long time) {
        timeCreated = time;
    }
    
    public long getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(long last) {
        lastUpdate = last;
    }
    
    
    
}
