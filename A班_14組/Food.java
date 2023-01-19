/*109403502·¨¯\ºð*/
public class Food{

	private String name;
	private int price;
	

	public Food(String name,int price){
		setname(name);
		setprice(price);
	}
	
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setprice(int price){
		this.price=price;
	}
	public int getprice(){
		return price;
	}
	
	
}