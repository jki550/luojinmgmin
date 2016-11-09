package java_exam;

import javax.management.loading.PrivateClassLoader;
import javax.xml.bind.annotation.XmlInlineBinaryData;

import lombok.Data;
@Data
public class human {
	public human() {
		super();
	}
	private String name;
	private boolean sex;
	private int age;
	public human(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

}