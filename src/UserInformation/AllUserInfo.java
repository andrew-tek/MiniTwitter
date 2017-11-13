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
 * @author Heather
 */
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
    
}
