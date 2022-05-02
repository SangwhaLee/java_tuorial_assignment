package A08_2;
import java.util.*;


public class WordBook implements AutoCloseable {
	ArrayList<String> list;
	
	public WordBook(ArrayList<String> list) {
		this.list = list;
		System.out.print("=====Created words=====\n[");
		for(String i: list) {
			System.out.print(i);
			if(list.indexOf(i)!=list.size()-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public int getSize() {
		return list.size();
	}
	
	public void enter(String name) throws Exception{
		boolean check = false;
		for(String i: list) {
			check = false;
			if(i.equals(name)) {
				check = true;
				list.remove(name);
				System.out.println(name+" Deleted");
				break;
			}
		}
		if(name.isEmpty()) {
			throw new Exception("You must type a word! Your input is empty!");
		}
		else if(check==false) {
			throw new Exception(name+" is not in the WordBook!");
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=====Remained words=====");
		System.out.print("[");
		for(String i: list) {
			System.out.print(i);
			if(list.indexOf(i)!=list.size()-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

}
