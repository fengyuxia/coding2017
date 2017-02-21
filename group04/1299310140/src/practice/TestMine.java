package practice;

import com.coding.basic.LinkedList;
import com.coding.basic.List;

public class TestMine {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("1");
		System.out.println(list.get(1));
		System.out.println(list);
		list.add(1,"2");
		list.add(0,"0");
		list.add(5,"5");
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.addFirst("0");
		list.addLast("9");
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
//		List list = new ArrayList();
//		list.add("a");
//		list.add(0, "0");
//		System.out.println("此时list的size："+list.size()+"[0,a]");
//		System.out.println("下标为0："+list.get(0));
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		list.add("7");
//		list.add("8");
//		System.out.println("此时list的size："+list.size()+"[0,a,1,2,3,4,5,6,7,8]");
//		list.add("9");
//		list.add("10");
//		System.out.println("此时list的size："+list.size()+"[0,a,1,2,3,4,5,6,7,8,9,10]");
//		System.out.println("下标为11："+list.get(11));
//		System.out.println(list.remove(5));
//		System.out.println("此时list的size："+list.size()+"[0,a,1,2,3,5,6,7,8,9,10]");
	}

}
