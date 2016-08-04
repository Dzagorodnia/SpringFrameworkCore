package dmytro.learn.spring.framework.core.impls.elements.goodquality;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import dmytro.learn.spring.framework.core.interfaces.Furniture;

@Component
@Lazy
public class GoodQualityFurniture implements Furniture {

	@Override
	public void move() {
		System.out.println("furniture not scratch the floor");

	}

}
