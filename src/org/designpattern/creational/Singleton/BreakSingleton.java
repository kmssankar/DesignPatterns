package org.designpattern.creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class BreakSingleton {

	public static void main(String[] args) {
		// Break Singleton design Pattern using Java reflection
		SingletonClass singClass = SingletonClass.getInstance();
		System.out.println(singClass); 
		Constructor<?>[] cnzSing = singClass.getClass().getDeclaredConstructors();
		SingletonClass singClassReflect = null;
		for(Constructor<?> eachCons: cnzSing)
			{
				eachCons.setAccessible(true);
				try
					{
						Date Dt = new Date();
						singClassReflect = (SingletonClass) eachCons.newInstance("Init Via Reflection @ " + Dt);
					} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
							| InvocationTargetException e)
					{
						e.printStackTrace();
					}
			}
		System.out.println(singClassReflect);
	}

}
