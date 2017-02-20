package practice;

//import com.coding.basic.ArrayList;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add(1,"b");
		list.add(1,"c");
		list.add(3,"d");//-1;4报错
		
		System.out.println(list.size());
		System.out.println(list.get(3));
	}

}
