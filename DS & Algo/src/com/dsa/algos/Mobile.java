package com.dsa.algos;


import java.util.Comparator;

public class Mobile implements Comparator<Mobile>
{
	private String name;
	private String color;
	private double price;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(String name,String color,double price) 
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	public String toString()
	{
	  return name+"\t\t"+color+"\t\t"+price;
	}

	public int compare(Mobile m2,Mobile m1)
	{
		if (m1.color.equals(m2.color)) 
		{
			return ((Double)m2.price).compareTo(m1.price);
		} 
		else if (m1.price == m2.price) 
		{
			return ((String)m2.name).compareTo(m1.name);
		}
		else
		{
			return ((String)m2.color).compareTo(m1.color);	
		}
	}


}
