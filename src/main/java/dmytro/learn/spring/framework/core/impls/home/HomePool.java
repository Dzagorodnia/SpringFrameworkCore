package dmytro.learn.spring.framework.core.impls.home;

import java.util.List;
import java.util.Map;

import dmytro.learn.spring.framework.core.interfaces.Building;
import dmytro.learn.spring.framework.core.interfaces.BuildingPool;

public class HomePool implements BuildingPool {

	private Map<Integer, Building> buildingMap;
	private List<Building> buildingList;

	@Override
	public void enableAllActivity() {
		if (buildingMap != null) {
			for (Map.Entry<Integer, Building> entry : buildingMap.entrySet()) {
				System.out.println(entry.getKey());
				entry.getValue().enableActivity();
			}
		}

		if (buildingList != null) {
			for (Building building : buildingList) {
				building.enableActivity();
			}
		}
	}

	public Map<Integer, Building> getBuildingMap() {
		return buildingMap;
	}

	public void setBuildingMap(Map<Integer, Building> buildingMap) {
		this.buildingMap = buildingMap;
	}

	public List<Building> getBuildingList() {
		return buildingList;
	}

	public void setBuildingList(List<Building> buildingList) {
		this.buildingList = buildingList;
	}

}
