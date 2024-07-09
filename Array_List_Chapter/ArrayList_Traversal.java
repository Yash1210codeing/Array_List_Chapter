package Array_List_Chapter;
import java.util.*;
public class ArrayList_Traversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        ll.add(2,-6);  //range 0 to size
        System.out.println(ll);
//        Collections.sort(ll);
//        System.out.println(ll);
        System.out.println(ll.size());
        //get range 0 to size-1
        System.out.println(ll.get(3));
        //Collections.reverse(ll);   // reverse kar dena array list ko
        System.out.println(ll);
        System.out.println(ll);
        //Set
        ll.set(3,90);
        System.out.println(ll);
        // remove
        System.out.println(ll.remove(1));
        System.out.println(ll);
        
	}

}
