package myFoodora2;

public abstract class User {
	protected static int idCounter;
	protected int id;
	protected String username;
	protected String name;
	protected boolean activated = true ; // activitated user or not ; by default, the user is activated when it arrives.
	
	public User(String username, String name) {
		super();
		this.username = username;
		this.name = name;
	}
	
	//public int getId() {return id;}

	public String getUsername() {return username;}

	public void setUsername(String username) {this.username = username;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}
	
	public boolean isActivated() {return activated;}

	public void setActivated(boolean activated) {this.activated = activated;}
	
}
