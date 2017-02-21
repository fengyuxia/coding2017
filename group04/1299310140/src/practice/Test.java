package practice;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();		
//		List<String> list = new ArrayList<String>();
		
		System.out.println("刚初始化的list的size："+list.size());
		list.add("a");
		list.add("2");
		System.out.println("测试add().[a,2]");
		System.out.println(list);
		System.out.println(list.size());
//		System.out.println(list.get(1));//-1~size 0~size-1
		list.add(2, "c");//-1~size+1
		System.out.println(list);
		list.remove(list.size()-1);//0~size-1
		System.out.println(list);
//		list.add(1,"b");
//		list.add(1,"c");
//		list.add(3,"d");
//		System.out.println("测试add(index,o).[a,c,b,d,2]");
//		System.out.println(list);
//		System.out.println("此时size："+list.size());
//		
//		list.add(list.size(),"e");//-1~size+1
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(5));//-1~size
//		System.out.println(list.remove(list.size()-1));//-1~size
//		System.out.println(list);
//		System.out.println(list.get(3));
	}

}
