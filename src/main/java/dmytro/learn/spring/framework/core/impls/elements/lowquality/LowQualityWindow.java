package dmytro.learn.spring.framework.core.impls.elements.lowquality;

import dmytro.learn.spring.framework.core.interfaces.Window;

public class LowQualityWindow implements Window {

	@Override
	public void setTransluent() {
		System.out.println("translucent ability not changed");

	}

}
