package dmytro.learn.spring.framework.core.impls.elements.lowquality;

import dmytro.learn.spring.framework.core.interfaces.Furniture;

public class LowQualityFurniture implements Furniture {

	@Override
	public void move() {
		System.out.println("furniture scratch the floor");

	}

}
