package com.qiheng.junit;

public class MyStack {
	private String[] Elements;
	private int index;
	
	public int getIndex() {
		return index;
	}

	public MyStack() {
		Elements = new String[100];
		index = 0;
	}

	public void push(String element) throws Exception {
		if (100 == index) {
			throw new Exception("数组越界异常！");
		}
		Elements[index++] = element;
	}

	public String pop() throws Exception {
		if (0 == index) {
			throw new Exception("数组越界异常！");
		}
		return Elements[--index];
	}

	public void delete(int n) throws Exception {
		if (index - n < 0) {
			throw new Exception("数组越界异常！");
		}
		index -= n;
	}

	public String top() throws Exception {
		if (0 == index) {
			throw new Exception("数组越界异常！");
		}
		return Elements[index - 1];
	}
}
