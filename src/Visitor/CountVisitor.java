/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;
import static UI.AdminFrame.getAdminFrame;
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
    
}
