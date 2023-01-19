/*109403502楊珮綾*/
public class Menu{

	private String []singlename=new String[10];
	private String []setname=new String[3];
	private int []singleprice=new int[10];
	private int []setprice=new int[3];

	/*設定單點資料，物件化導入Menu*/
	Single m1=new Single(1,"麥香雞",false,44);
	Single m2=new Single(2,"滿福堡",true,48);
	Single m3=new Single(3,"大麥克",false,72);
	Single w1=new Single(4,"薯條(小)",false,33);
	Single w2=new Single(5,"薯條(中)",false,44);
	Single w3=new Single(6,"薯條(大)",false,55);
	Single w4=new Single(7,"薯餅",false,30);
	Single d1=new Single(8,"可樂(小)",false,28);
	Single d2=new Single(9,"雪碧(小)",false,28);
	Single d3=new Single(10,"玉米濃湯",false,40);
	Single [] single={m1,m2,m3,w1,w2,w3,w4,d1,d2,d3};

	/*設定套餐資料，物件化導入Menu*/
	Set a=new Set("A","普通套餐",5,0,9,60);
	Set b=new Set("B","薯餅套餐",4,7,8,70);
	Set c=new Set("C","吃很飽套餐",6,0,9,70);
	Set [] set={a,b,c};

	/*單點名稱，Order需要*/
	public String getname(int id){
		for(int i=0;i<single.length;i++){
			singlename[i]=single[i].getname();
		}
		return singlename[id-1];
	}
	/*套餐名稱，Order需要*/
	public String getname(String id){
		for(int i=0;i<set.length;i++){
			setname[i]=set[i].getname();
		}
		if(id=="A"){
			return setname[0];
		}else if(id=="B"){
			return setname[1];
		}else if(id=="C"){
			return setname[2];
		}else{
			return null;
		}
	}
	
	/*單點價錢，Order需要*/
	public int getprice(int id){
		for(int i=0;i<single.length;i++){
			singleprice[i]=single[i].getprice();
		}
		return singleprice[id-1];
	}
	/*套餐價錢，Order需要*/
	public int getprice(String id){
		for(int i=0;i<set.length;i++){
			setprice[i]=set[i].getprice();
		}
		if(id=="A"){
			return setprice[0];
		}else if(id=="B"){
			return setprice[1];
		}else if(id=="C"){
			return setprice[2];
		}else{
			return 0;
		}
	}
}