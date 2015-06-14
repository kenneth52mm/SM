package services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class persona {
	private String name;

	
	public persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public persona(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
