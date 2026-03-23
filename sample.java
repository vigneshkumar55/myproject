import java.util.*;
public class sample
{
	public static void main(String[] args)
	{
		Vector<integer> v=new vector<>(3);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		System.out.println("vector element:"+v);
		System.out.println("size:"+v.size);
		System.out.println("capacity:"+v.capacity);
		System.out.println("removed element:"+v.remove(2));
		System.out.println("element at first index:"+v.element(1));
		v.close();
		System.out.println("vector element:"+v);
	}
}