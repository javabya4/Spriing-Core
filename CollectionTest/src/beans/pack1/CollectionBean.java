package beans.pack1;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	private List theList;
	private Map theMap;
	public List getTheList() {
		return theList;
	}
	public void setTheList(List theList) {
		this.theList = theList;
	}
	public Map getTheMap() {
		return theMap;
	}
	public void setTheMap(Map theMap) {
		this.theMap = theMap;
	}
	
	public void showTheMap()
	{
		System.out.println("container has created the object of "+theMap.getClass().getName());
		System.out.println("Map values = "+theMap);
	}
	
	public void showTheList()
	{
		System.out.println("container has created the object of "+theList.getClass().getName());
		System.out.println("List values = "+theList);
	}

}
