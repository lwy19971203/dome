package com.example.calculator;

public class InputItem {
	
	private String input;
	private int type;
	
	
	

	public InputItem(String input, int type) {
		super();
		this.input = input;
		this.type = type;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	interface InputType {
		 int INT_TYPE = 0; //int 类型
		 int DOUBLE_TYPE=1; //double 类型
		 int OPERATOR_TYPE = 2; //操作符类型
		 int ERROR = 3; //操作符类型
	}

	@Override
	public String toString() {

		return "InputItem [input=" + input + ", type=" + type + "]";
	}
	

}
