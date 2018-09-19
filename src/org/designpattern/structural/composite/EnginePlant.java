package org.designpattern.structural.composite;

import java.util.ArrayList;

public class EnginePlant implements Engine {

	private ArrayList<Engine> engineList  = new ArrayList();
	@Override
	public void buildEngine(int cc) {
		for (Engine eng:engineList)
			{
				eng.buildEngine(cc);
			}
	}
	
	public void addEngine(Engine engine)
	{
		engineList.add(engine);
	}
	

	public void removeEngines()
	{
		System.out.println("Removed all the Engines ");
		engineList.removeAll(engineList);
	}
	

}
