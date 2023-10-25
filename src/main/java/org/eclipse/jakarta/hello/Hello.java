package org.eclipse.jakarta.hello;

public class Hello {

	private String name;
	
	public Hello(String name) {
        this.name = name;
	}

	public String getHello(){
		return name;
	}

	@Override
	public String toString() {
		return "Hello " + name + "]";
	}
	
	
}