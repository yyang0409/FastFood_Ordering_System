/*109403502·¨¯\ºð*/
public class Single extends Food{
	private int id;
	private boolean breakfast;

	public Single(int id,String name,boolean breakfast,int price){
		super(name,price);
		setid(id);	
		setbreakfast(breakfast);
	}
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setbreakfast(boolean breakfast){
		this.breakfast=breakfast;
	}
	public boolean getbreakfast(){
		return breakfast;
	}
}