import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;


public class Group implements Tree {

	private boolean target;
    private String SSID;
    private List<User> GroupGroupUsers = new ArrayList();
    private static DefaultMutableTreeNode root;

    private int GroupCount = 0;

    //default constructor	
    public Group() {
    	//creating tree node with no parent or children
        root = new DefaultMutableTreeNode("Root");
        GroupCount++;
    }
    //constructor
    public Group(String SSID) {
        this(SSID, true);
        GroupCount++;
    }
    //constructor
    public Group(String SSID, boolean property) {
        this.target = property;
        this.SSID = SSID;
        GroupCount++;
    }

    public int getgroupCount() {
        return GroupCount;
    }

    public DefaultMutableTreeNode getRoot() {
        return root;
    }

    @Override
    public String getID() {
        return SSID;
    }

    @Override
    public boolean isResult() {
        return target;
    }
    
    @Override
    public String toString() {
        return SSID;
    }
}