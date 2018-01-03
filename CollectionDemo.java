package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
	}
	public static void show(Collection c1,Collection c2){
		//��c1��c2���Ԫ��
		c1.add("demo1");
		c1.add("demo2");
		c1.add("demo3");
		c2.add("demo2");
		c2.add("demo4");
		c2.add("demo5");
		
		System.out.println("c1"+c1);
		System.out.println("c2"+c2);
		
//		c1.addAll(c2); //��c2�е�Ԫ����ӵ�c1�С�
//		System.out.println("c1:"+c1);
		
		//��ʾremoveAll
//		boolean b = c1.removeAll(c2);//�����������е���ͬԪ�شӵ���removeAll�ļ�����ɾ����
//		System.out.println("removeAll:"+b);
		
		//��ʾcontainsAll
//		boolean b = c1.containsAll(c2);
//		System.out.println("containsAll:"+b);
		
		//��ʾretianAll
		boolean b = c1.retainAll(c2);//ȡ����,������ָ���ļ�����ͬ��Ԫ�أ���ɾ����ͬ��Ԫ�ء���removeAll�����෴��
		System.out.println("c1"+c1);
	}
	public static void show(Collection coll){
		//1,���Ԫ�ء�add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");

		System.out.println(coll);
		

		//2�����Ԫ��
		coll.remove("abc3");
		System.out.println(coll.contains("abc3"));
		System.out.println(coll);
	}
}
