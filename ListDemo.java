package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List list = new ArrayList();
		show(list);
	}

	private static void show(List list) {
		
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//����Ԫ��
		list.add(1,"abc6");
		System.out.println(list);
		
		//ɾ��Ԫ��
		System.out.println("remove:"+list.remove(2));
		
		//�޸�Ԫ��
		System.out.println("set:"+list.set(1, "abc4"));
		
		//��ȡ���б�
		System.out.println("sublist:"+list.subList(1,2));
		System.out.println(list);
	}

}
