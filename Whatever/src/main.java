
public class main {

	public static void main(String[] args) {
		
		Container c = new Container();
		Item test = new TestItem();
		c.insert(test);
		System.out.println(c.call(0).name);
	}

}
