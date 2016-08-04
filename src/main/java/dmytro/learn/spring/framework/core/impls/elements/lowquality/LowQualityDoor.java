package dmytro.learn.spring.framework.core.impls.elements.lowquality;

import dmytro.learn.spring.framework.core.interfaces.Door;

public class LowQualityDoor implements Door {

	@Override
	public boolean open() {
		System.out.println("the door not opened");
		return false;
	}

	@Override
	public boolean close() {
		System.out.println("the door not closed");
		return false;
	}

}
