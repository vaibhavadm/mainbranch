/**
 * 
 */
package com.git.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author VAIBHAVREDDYGUDDETI Mar 19, 2017
 */
public class ObjectCreationTechniques implements Cloneable, Serializable {
	public void demoTesting() {
		System.out.println("Object created");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException,
			IllegalArgumentException, InvocationTargetException, IOException {
		// Using new keyword, creates a new object at compile time
		ObjectCreationTechniques obj1 = new ObjectCreationTechniques();
		obj1.demoTesting();

		// Class.forName() gives you the class object, which is useful for
		// reflection.
		ObjectCreationTechniques obj2 = (ObjectCreationTechniques) Class
				.forName("com.git.testing.ObjectCreationTechniques").newInstance();
		obj2.demoTesting();

		// Using class:newInstance this is a dynamic construct that looks up a
		// class with a specific name.
		ObjectCreationTechniques obj3 = (ObjectCreationTechniques) ObjectCreationTechniques.class.getClassLoader()
				.loadClass("com.git.testing.ObjectCreationTechniques").newInstance();
		obj3.demoTesting();

		// Using clone, but you need to implement the Cloneable interface,
		ObjectCreationTechniques obj4 = (ObjectCreationTechniques) obj1.clone();
		obj4.demoTesting();
		
		//Using default class constructor from java.lang.reflect.*
		@SuppressWarnings("rawtypes")
		Class clazz = ObjectCreationTechniques.class;
		@SuppressWarnings("rawtypes")
		Constructor constructorObj = clazz.getDeclaredConstructors()[0];
		ObjectCreationTechniques obj5 = (ObjectCreationTechniques) constructorObj.newInstance();
		obj5.demoTesting();
		
		//Using Deserialization
		// create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream(
				"/Users/VAIBHAVREDDYGUDDETI/Softwares/javaworkfolder/SimplePrograms/src/com/git/testing/obj.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		// write something in the file
		oout.writeObject(obj1);
		oout.flush();
		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"/Users/VAIBHAVREDDYGUDDETI/Softwares/javaworkfolder/SimplePrograms/src/com/git/testing/obj.txt"));
		ObjectCreationTechniques obj6 = (ObjectCreationTechniques) ois.readObject();
		obj6.demoTesting();
	}
}
