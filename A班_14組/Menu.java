/*109403502���\��*/
public class Menu{

	private String []singlename=new String[10];
	private String []setname=new String[3];
	private int []singleprice=new int[10];
	private int []setprice=new int[3];

	/*�]�w���I��ơA����ƾɤJMenu*/
	Single m1=new Single(1,"������",false,44);
	Single m2=new Single(2,"���ֳ�",true,48);
	Single m3=new Single(3,"�j���J",false,72);
	Single w1=new Single(4,"����(�p)",false,33);
	Single w2=new Single(5,"����(��)",false,44);
	Single w3=new Single(6,"����(�j)",false,55);
	Single w4=new Single(7,"����",false,30);
	Single d1=new Single(8,"�i��(�p)",false,28);
	Single d2=new Single(9,"����(�p)",false,28);
	Single d3=new Single(10,"�ɦ̿@��",false,40);
	Single [] single={m1,m2,m3,w1,w2,w3,w4,d1,d2,d3};

	/*�]�w�M�\��ơA����ƾɤJMenu*/
	Set a=new Set("A","���q�M�\",5,0,9,60);
	Set b=new Set("B","����M�\",4,7,8,70);
	Set c=new Set("C","�Y�ܹ��M�\",6,0,9,70);
	Set [] set={a,b,c};

	/*���I�W�١AOrder�ݭn*/
	public String getname(int id){
		for(int i=0;i<single.length;i++){
			singlename[i]=single[i].getname();
		}
		return singlename[id-1];
	}
	/*�M�\�W�١AOrder�ݭn*/
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
	
	/*���I�����AOrder�ݭn*/
	public int getprice(int id){
		for(int i=0;i<single.length;i++){
			singleprice[i]=single[i].getprice();
		}
		return singleprice[id-1];
	}
	/*�M�\�����AOrder�ݭn*/
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