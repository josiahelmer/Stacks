package stacks.controller;

import java.util.*;
import java.awt.Color;
import stacks.controller.StacksDishes;


public class StacksController
{
	private Stack<StacksDishes> Dishes;
	private Boolean isDirty;
	private Color Java.awt.Color;
	
	public void Stacks()
	{
		Dishes = new Stack<StacksDishes>();



		Dishes.add(new StacksDishes(false, java.awt.Color.GREEN, 0));
		System.out.println(Dishes.size());
		Dishes.pop();
		System.out.println(Dishes.size());
		Dishes.push(new StacksDishes(true, java.awt.Color.YELLOW, 0));

		
	
	}
	
	public void start()
	{
		
	}
}
