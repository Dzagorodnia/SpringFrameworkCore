package dmytro.learn.spring.framework.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dmytro.learn.spring.framework.core.impls.home.Home;

public class CoreMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("only_component_scan_context.xml");

		Home home = (Home) context.getBean("home4");
		home.enableActivity();

		Home home2 = (Home) context.getBean("home5");
		home.enableActivity();

		/* used in old_context.xml */
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("old_context.xml");
		// Home home = (Home) context.getBean("HomeRequiredProperty");
		// home.enableActivity();
		//
		// HomeFactory homeFactory = (HomeFactory)
		// context.getBean("HomeFactory");
		// Building building1 = homeFactory.createBuilding();
		// Building building2 = homeFactory.createBuilding();
		// Building building3 = homeFactory.createBuilding();
		// building1.enableActivity();
		// building2.enableActivity();
		// building3.enableActivity();
		//
		// HomePool homePool = (HomePool)
		// context.getBean("HomeFilteredListYellow");
		// homePool.enableAllActivity();

	}

}
