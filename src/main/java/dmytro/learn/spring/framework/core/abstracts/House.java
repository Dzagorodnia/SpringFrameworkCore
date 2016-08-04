package dmytro.learn.spring.framework.core.abstracts;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import dmytro.learn.spring.framework.core.interfaces.Building;
import dmytro.learn.spring.framework.core.interfaces.Door;
import dmytro.learn.spring.framework.core.interfaces.Furniture;
import dmytro.learn.spring.framework.core.interfaces.Window;

public abstract class House implements Building {

	/* Qualifier used for bean "HomeQualifierAutowired" in old_context.xml */
	// @Qualifier("bulletproofDoor")
	@Inject
	private Door door;

	@Autowired(required = false)
	private Furniture furniture;

	@Autowired
	private Window window;

	public House() {
		super();
	}

	public House(Door door, Furniture furniture, Window window) {
		super();
		this.door = door;
		this.furniture = furniture;
		this.window = window;
	}

	public Door getDoor() {
		return door;
	}

	/* Required used for bean "HomeRequiredProperty" in old_context.xml */
	// @Required
	public void setDoor(Door door) {
		this.door = door;
	}

	public Furniture getFurniture() {
		return furniture;
	}

	/* Required used for bean "HomeRequiredProperty" in old_context.xml */
	// @Required
	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}

	public Window getWindow() {
		return window;
	}

	/* Required used for bean "HomeRequiredProperty" in old_context.xml */
	// @Required
	public void setWindow(Window window) {
		this.window = window;
	}

}
