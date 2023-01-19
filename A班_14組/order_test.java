/*108403054�i�w��*/
import java.util.*;

public class order_test{
	private int totalprice = 0;
	private ArrayList<Integer> SingleOrder = new ArrayList<>();
	private ArrayList<String> SetOrder = new ArrayList<> ();

	private int A , B , C;
	Menu menu = new Menu();
	/*�W�[���I�A��Userclass*/
	public int addSingleOrder(int id){
		int price = 0;

		SingleOrder.add(id);
		Collections.sort(SingleOrder);
		price = menu.getprice(id);
		addTotalprice(price);

		return totalprice;
	}
	/*�R����I�A��Userclass*/
	public int delSingleOrder(int id){
		int price = 0;
		SingleOrder.remove(Integer.valueOf(id));
		Collections.sort(SingleOrder);
		price = menu.getprice(id);
		addTotalprice(-1*(price));

	return totalprice;
	}
	/*�W�[�M�\�A��Userclass*/
	public int addSetOrder(String id){
		int price = 0;

		SetOrder.add(id);
		Collections.sort(SetOrder);
		price = menu.getprice(id);
		addTotalprice(price);

		return totalprice;
	}
	/*�R��M�\�A��Userclass*/
	public int delSetOrder(String id){
		int price = 0;
		SetOrder.remove(id);
		Collections.sort(SetOrder);
		price = menu.getprice(id);
		addTotalprice(-1*(price));

	return totalprice;
	}
	/*�W�[�`����*/
	public void addTotalprice(int totalprice){this.totalprice += totalprice; }
	/*�^���`����*/
	public int getTotalprice(){return totalprice; }

	public void getlist(){
		for(int i = 0; i < SingleOrder.size(); i++) {
			System.out.println(SingleOrder.get(i));
		}
	}

	/*�^���I�\���G�r��A��Userclass*/
	public String toString(){
		int singleid = 0 , singlenum = 0 , setnum = 0;
		String name = "" , setid = "";
		String list = "�A���\�I��:\n\n���I :\n";

		for (int i = 0 ; i < SingleOrder.size() ; i++){
			if(singleid == SingleOrder.get(i)){
				singlenum++;
			}else if(singleid != SingleOrder.get(i) & singlenum != 0){
				list += singlenum + "\n";
				singleid = (SingleOrder.get(i));
				list += menu.getname(SingleOrder.get(i)) + " : ";
				singlenum = 1;
			}else if(singleid != SingleOrder.get(i) & singlenum == 0){
				singleid = (SingleOrder.get(i));
				list += menu.getname(SingleOrder.get(i)) + " : ";
				singlenum = 1;
			}
		}
		if(SingleOrder.size() != 0){list += singlenum + "\n\n";}

		list += "�M�\ :\n";

		for (int i = 0 ; i < SetOrder.size() ; i++){
			
			if(setid == SetOrder.get(i)){
				setnum++;
			}else if(setid != SetOrder.get(i) & setnum != 0){
				list += setnum + "\n";
				setid = (SetOrder.get(i));
				list += menu.getname(SetOrder.get(i)) + " : ";
				setnum = 1;
			}else if(setid != SetOrder.get(i) & setnum == 0){
				setid = (SetOrder.get(i));
				list += menu.getname(SetOrder.get(i)) + " : ";
				setnum = 1;
			}
		}
		if(SetOrder.size() != 0){list += setnum + "\n";}

		return list;
	}
}