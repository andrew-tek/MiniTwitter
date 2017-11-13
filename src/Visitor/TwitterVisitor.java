/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Andrew
 */

//Interface that shows all the places to visit.
public interface TwitterVisitor {
    public String visitUsers();
    public String visitGroups();
    public String visitMessages();
    //Positive count is messages with "happy" or similar words.
    public String visitPositives();
}
