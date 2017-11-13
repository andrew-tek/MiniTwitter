/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersAndGroups;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Heather
 */
public class Group extends Leaf{
    private List <Leaf> leaves;
    public Group() {
        super();
        leaves = new ArrayList<Leaf>();
    }
    public Group (String s) {
        id = s;
        node = new DefaultMutableTreeNode(s); 
        leaves = new ArrayList<Leaf>();
    }
    public List<Leaf> getLeaves() {
        return leaves;
    }
    @Override
    public void add(Leaf treeNode) {
        node.add(treeNode.getNode());
        leaves.add(treeNode);
    }
    
}
