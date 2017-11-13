/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersAndGroups;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Andrew
 */

//Abstract class holding general structure for what is on a JTree
public abstract class Leaf  {
    String id;
    DefaultMutableTreeNode node;
    
    public Leaf() {
        node = new DefaultMutableTreeNode();
    }
    public DefaultMutableTreeNode getNode() {
        return node;
    }
    public void setNode (DefaultMutableTreeNode treeNode) {
        node = treeNode;
    }
    public String getID() {
        return id;
    }
    public void setID (String s) {
        id = s;
    }
    public abstract void add(Leaf treeNode);

}
