import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;
public class ArrayList_And_LinkedList
{
	public static void main(String args)
	{
		ArrayList<Data> array = new ArrayList<Data>();
		Data a = new Data("Fred",21);
		Data b = new Data("Jo", 43);
		Data c = new Data("Zoe",37);
		array.add(a);
		array.add(b);
		array.add(c);
		
		
	}
	
	public static void PrintCollection(Collection<Data> array)
	{
		for (Iterator<Data> iter = array.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}

}