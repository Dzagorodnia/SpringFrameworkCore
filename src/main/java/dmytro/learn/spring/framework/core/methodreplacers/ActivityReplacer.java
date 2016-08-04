package dmytro.learn.spring.framework.core.methodreplacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ActivityReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Home do smth new");
		return null;
	}

}
