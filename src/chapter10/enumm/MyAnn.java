package chapter10.enumm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.PACKAGE,ElementType.PARAMETER})
public @interface MyAnn {
	
	String name() default "Tom";

}
