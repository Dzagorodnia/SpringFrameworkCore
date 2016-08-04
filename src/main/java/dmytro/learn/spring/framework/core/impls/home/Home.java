package dmytro.learn.spring.framework.core.impls.home;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import dmytro.learn.spring.framework.core.abstracts.House;
import dmytro.learn.spring.framework.core.enums.Color;
import dmytro.learn.spring.framework.core.interfaces.Door;
import dmytro.learn.spring.framework.core.interfaces.Furniture;
import dmytro.learn.spring.framework.core.interfaces.Window;

//@Named
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Configuration
public class Home
		extends House /* implements InitializingBean, DisposableBean */ {

	private int floors;
	private Color color;
	boolean populated;

	public Home() {
		super();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Home home4() {
		return new Home();
	}

	@Bean
	public Home home5() {
		return new Home(9, Color.YELLOW, true);
	}

	public Home(Door door, Furniture furniture, Window window) {
		super(door, furniture, window);
	}

	public Home(Door door, Furniture furniture, Window window, int floors, Color color, boolean populated) {
		super(door, furniture, window);
		this.floors = floors;
		this.color = color;
		this.populated = populated;
	}

	public Home(int floors, Color color, boolean populated) {
		super();
		this.floors = floors;
		this.color = color;
		this.populated = populated;
	}

	@Override
	public void enableActivity() {
		getDoor().open();
		getFurniture().move();
		getWindow().setTransluent();
		System.out.println("floors: " + floors);
		System.out.println("color: " + color);
		System.out.println("populeted: " + populated);
		System.out.println();
	}

	public void initHome() {
		System.out.println("initHome " + this);
	}

	public void destroyHome() {
		System.out.println("destroyHome " + this);
	}

	/* used with interfaces InitializingBean and DisposableBean */
	// @Override
	// public void destroy() throws Exception {
	// System.out.println("destroy " + this);
	// }
	//
	// @Override
	// public void afterPropertiesSet() throws Exception {
	// System.out.println("afterPropertiesSet() " + this);
	// }

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isPopulated() {
		return populated;
	}

	public void setPopulated(boolean populated) {
		this.populated = populated;
	}

}
