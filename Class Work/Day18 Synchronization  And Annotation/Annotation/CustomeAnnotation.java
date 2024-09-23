package Annotation;
/*
 * Custom Annotation
 * an interface with @ sign
 * with all non implemented methods
 * method represents value for annotation
 * method will have return type
 * fix the level for your annotation 
 * return policy
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface TestAnnotation {
	String teacher()

	default "Vinaya";

	String subject();
}

public class CustomeAnnotation {

	@TestAnnotation(teacher = "vinaya", subject = "Java Full Stack")
	public void method1() {
		System.out.println("Method - 1");
	}

	@TestAnnotation(teacher = "P.T.Savale", subject = "Java Full Stack")
	public void method2() {
		System.out.println("Method - 2");
	}

	public static void main(String[] args) {

//		try {
//			Method m = CustomeAnnotation.class.getMethod("method1");
//			TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
//			if (personAnnotation != null) {
//				System.out.println("Name : " + personAnnotation.teacher());
//				System.out.println("Subject : " + personAnnotation.subject());
//				System.out.println("------------------------------------");
//			}
//		} catch (NoSuchMethodException e) {
//			System.out.println("No Such Method ");
//			return;
//		}
//		CustomeAnnotation obj = new CustomeAnnotation();
//		obj.method1();
		
		try {
			Method[] methods = CustomeAnnotation.class.getMethods();
			for(Method m : methods ) {
				TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
				if (personAnnotation != null) {
					System.out.println("Name : " + personAnnotation.teacher());
					System.out.println("Subject : " + personAnnotation.subject());
					System.out.println("------------------------------------");
				}
			}
		} catch (Exception e) {
			System.out.println("No Such Method ");
			return;
		}
		CustomeAnnotation obj = new CustomeAnnotation();
		obj.method1();
		
	}

}
