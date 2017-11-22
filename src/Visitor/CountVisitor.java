/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;
import static UI.AdminFrame.getAdminFrame;
import UserInformation.AllUserInfo;
import UserInformation.UserInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Andrew
 */
//All visitors that involve counting
public class CountVisitor implements TwitterVisitor {
    @Override
    public String visitUsers() {
       return Integer.toString(getAdminFrame().getUserCount());
    }

    @Override
    public String visitGroups() {
       return Integer.toString(getAdminFrame().getGroupCount());
    }

    @Override
    public String visitMessages() {
        return Integer.toString(getAdminFrame().getMessageCount());
    }

    @Override
    public String visitPositives() {
        return Integer.toString(getAdminFrame().getMessageCount());
    }
    @Override
    public boolean checkID() {
        AllUserInfo allUsers = getAdminFrame().getAllUsers();
        Map <String, UserInfo> duplicate = new HashMap <String, UserInfo>();  
        List <UserInfo> userInfo;
        userInfo = new ArrayList<UserInfo> (allUsers.getUsers().values());
        for (UserInfo us : userInfo) {
            System.out.println(us.getID());
            if (duplicate.containsValue(us)) {
                return false;
            }
            else {
                duplicate.put(us.getID(), us);
            }
        }
        return true;
        
    }

    @Override
    public UserInfo visitLastUpdated() {
        return getAdminFrame().getLastUpdatedUser();
    }
    
}
