package dmytro.learn.spring.framework.core.impls.elements.goodquality;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import dmytro.learn.spring.framework.core.interfaces.Door;

@Component
@Lazy
public class GoodQualityDoor implements Door {

	private boolean bulletproof;

	@Override
	public boolean open() {
		if (bulletproof) {
			System.out.println("bulletproof door is opened");
		} else {
			System.out.println("the door is opened");
		}
		return true;
	}

	@Override
	public boolean close() {
		if (bulletproof) {
			System.out.println("bulletproof door is closed");
		} else {
			System.out.println("the door is closed");
		}
		return true;
	}

	public boolean isBulletproof() {
		return bulletproof;
	}

	public void setBulletproof(boolean bulletproof) {
		this.bulletproof = bulletproof;
	}

}
