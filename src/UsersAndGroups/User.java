/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersAndGroups;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Heather
 */
public class User extends Leaf{
    public User(){
        super();
    }
    public User (String s) {
        id = s;
        node = new DefaultMutableTreeNode(s, false);   
    }
    public User (User u) {
        super();
        node = u.getNode();
        id = u.getID();
    }

    @Override
    public void add(Leaf treeNode) {
        node.add(treeNode.getNode());
    }
    
    



}
