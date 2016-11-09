package java_exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class<?> a = Class.forName("java_exam.human");
		System.out.println(a);

		Field[] f = a.getDeclaredFields();
		System.out.println(f.length);
		for (Field field : f) {
			System.out.println(field);
		}
		Field ffield=a.getDeclaredField("name");
		
		Method[] b = a.getDeclaredMethods();
		System.out.println(b.length);
		for (Method field : b) {
			System.out.println(field);
		}
		ffield.setAccessible(true);
	    Object obj2=a.newInstance();
		ffield.set(obj2, "luojingmin");
		System.out.println(ffield.get(obj2));
		
		Method[] bMethods=a.getDeclaredMethods();
		System.out.println(bMethods.length);
		for (Method method : bMethods) {
			System.out.println(method);	
		}
		Method cMethod = a.getDeclaredMethod("setName", String.class);
		Object object=a.newInstance();
		cMethod.invoke(object, "ljm");
		System.out.println(a.getName());
	   
	    Constructor[] cr=a.getConstructors();
	    for (Constructor constructor : cr) {
	    	System.out.println(constructor);
		}
	    human hum1=null;
	    human hum2=null;
	    hum1=(human) cr[0].newInstance();
	    hum2=(human) cr[1].newInstance("luojingmin",25,true);
	}   		
}
