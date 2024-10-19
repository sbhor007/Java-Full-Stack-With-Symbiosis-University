package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization in java is the process of converting the 
 * state of an object into a byte stream.
 * 
 * A byte stream is a Java I/O (input/output) stream
 * This reverse process of converting an object into byte-stream is called deserialization 
 * the purpose of serialization is to save the state of an object and recreate it in a new Location
 */

public class Student implements Serializable {
	public String studentName;
	public String studentAddr;
	public int studentId;
	public static void main(String[] args) {
		Student deserializedStudenta;
		Student std = new Student();
		std.studentName = "Santosh";
		std.studentAddr = "India";
		std.studentId = 1;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
			//Serializing object
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(std);
				// close output Stream
				out.close();
				
				//close the file
				fileOut.close();
				System.out.println("Object Serialized");
				FileInputStream fileIn = new FileInputStream("storeObject.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				
			// Deserialization
				deserializedStudenta = (Student) in.readObject();
				in.close();
				fileIn.close();
				
				//printing the deserialized object.
				System.out.println("Deserialized Student....");
				System.out.println("Name : " + deserializedStudenta.studentName);
				System.out.println("Address : " + deserializedStudenta.studentAddr);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
