package Array_List_Chapter;
import java.util.ArrayList;
public class Array_List_Index_Value_Add_Method_Size_Demo_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.add(2,-6);            // Range 0 to size
		System.out.println(ll);
		System.out.println(ll.size());
	}

}