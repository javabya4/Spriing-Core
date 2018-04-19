

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.pack1.CollectionBean;

public class Main {
	public static void main(String[] args)
	{
		//start the container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//read the bean object
		Object obj=ctx.getBean("collectionBean");
		CollectionBean cbean=(CollectionBean)obj;
		cbean.showTheList();
		cbean.showTheMap();
	}
	

}
