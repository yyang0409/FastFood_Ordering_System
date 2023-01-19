/*109403502·¨¯\ºð*/
public class Set extends Food{

	private String id;
	private int with_1;
	private int with_2;
	private int drink;
	
	public Set(String id,String name,int with_1,int with_2,int drink,int price){
		super(name,price);
		setid(id);
		setwith_1(with_1);
		setwith_2(with_2);
		setdrink(drink);
	}
	
	public void setid(String id){
		this.id=id;
	}
	public String getid(){
		return id;
	}

	public void setwith_1(int with_1){
		this.with_1=with_1;
	}
	public int getwith_1(){
		return with_1;
	}

	public void setwith_2(int with_2){
		this.with_2=with_2;
	}
	public int getwith_2(){
		return with_2;
	}
	
	public void setdrink(int drink){
		this.drink=drink;
	}
	public int getdrink(){
		return drink;
	}
}