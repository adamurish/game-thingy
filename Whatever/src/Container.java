import java.util.ArrayList;

public class Container {
	int itemNumber = 0;
	ArrayList<Item> l = new ArrayList<Item>();
	public void insert(Item i)
	{
		l.add(i);
		
	}
	public Item call(int position)
	{
		return l.get(position);
	}

}
