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
    public abstract void add(Leaf treeNode);

}
