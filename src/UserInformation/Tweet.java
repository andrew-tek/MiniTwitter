/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInformation;

/**
 *
 * @author Andrew
 */

//Special type of subject that has a message
public class Tweet extends Subject{
    private String message;
    public Tweet (String s) {
        message = s;
    }
    public String getMessage() {
        return message;
    }
    
}
