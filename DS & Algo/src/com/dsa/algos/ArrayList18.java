package com.dsa.algos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList18 
{

	public static void main(String[] args)  
	{
		List<Mobile> l = new ArrayList<Mobile>();
		l.add(new Mobile("lenovo","green",15000));
		l.add(new Mobile("lenovo","blue",15000));
		l.add(new Mobile("lenovo","brown",15000));
		l.add(new Mobile("lenovo","red",16000));
		l.add(new Mobile("lenovo","orange",15000));
		l.add(new Mobile("lenovo1","red",16000));
		
		System.out.println("Before");
		for (int i = 0; i < l.size(); i++) 
		{
			Mobile m = l.get(i);
			System.out.println(m);
		}
		
		Collections.sort(l, new Mobile());
		
		// Comparator<Mobile> c = new Mobile();
		
		System.out.println();
		System.out.println("After");
		for (int i = 0; i < l.size(); i++) 
		{
			Mobile m = l.get(i);
			System.out.println(m);
		}

		
	}

}
