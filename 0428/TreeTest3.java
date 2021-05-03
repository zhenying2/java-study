import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
public class TreeTest3 
{
	JTree tree;
	public TreeTest3(String msg) 
	{
		JFrame jf=new JFrame(msg);
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("ROOT");
		DefaultMutableTreeNode parent= new DefaultMutableTreeNode("PARENT");
		DefaultMutableTreeNode child1= new DefaultMutableTreeNode("CHILD1");
		DefaultMutableTreeNode child2= new DefaultMutableTreeNode("CHILD2");
		parent.add(child1);
		parent.add(child2);
		root.add(parent);
		tree=new JTree(root);
		JScrollPane sp=new JScrollPane(tree);

		DefaultTreeCellRenderer renderer=new DefaultTreeCellRenderer();
		renderer.setLeafIcon(new ImageIcon("../image/FolderOpen.gif"));
		renderer.setClosedIcon(new ImageIcon("../image/Folder.gif"));
		renderer.setOpenIcon(new ImageIcon("../image/Document.gif"));
		tree.setCellRenderer(renderer);
		tree.setEditable(true);

		tree.addTreeSelectionListener(new TreeSelectionListener(){
			public void valueChanged(TreeSelectionEvent e){
				DefaultMutableTreeNode node=(DefaultMutableTreeNode)(e.getPath().getLastPathComponent());
				Object nodeObj=node.getUserObject();
				System.out.println("Path = "+e.getPath() );
				System.out.println("Object = "+nodeObj );
			}
		});

		jf.getContentPane().add(sp,"Center");
		jf.setSize(300,200);
		jf.setVisible(true);
	}
}