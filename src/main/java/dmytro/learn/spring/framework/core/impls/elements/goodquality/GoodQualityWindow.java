package dmytro.learn.spring.framework.core.impls.elements.goodquality;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import dmytro.learn.spring.framework.core.interfaces.Window;

@Component
@Lazy
public class GoodQualityWindow implements Window {

	@Override
	public void setTransluent() {
		System.out.println("translucent ability changed");

	}

}
