package dmytro.learn.spring.framework.core.impls.home;

import dmytro.learn.spring.framework.core.interfaces.Building;
import dmytro.learn.spring.framework.core.interfaces.BuildingFactory;

public abstract class HomeFactory implements BuildingFactory {

	@Override
	public abstract Building createBuilding();

}
