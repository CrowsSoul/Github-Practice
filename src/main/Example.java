package main;

public class Example {
	private int value;
	
	//这是一个构造方法
	public Example(int x)
	{
		this.value = x;
	}
	
	//这是一个用于返回value值的方法
	public int getValue()
	{
		return this.value;
	}
	
	//这是一个用于修改value值的方法
	public void setValue(int x)
	{
		this.value = x;
	}
}
