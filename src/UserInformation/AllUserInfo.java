/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInformation;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author Andrew
 */

//This class holds the information for all users. It uses a map
public class AllUserInfo {
    private Map <String, UserInfo> users;
    
    public AllUserInfo() {
        users = new HashMap <String, UserInfo>() ;
    }
    public void addUser (UserInfo i) {
        users.put(i.getID(), i);
    }
    public UserInfo getUserInfo (String s) {
        return users.get(s);
    }
    public void putUser (String s, UserInfo user) {
        users.put(s, user);
    }
    public Map getUsers() {
        return users;
    }
    
}
