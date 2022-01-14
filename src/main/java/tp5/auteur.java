package tp5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface auteur {
	
	String name() ;
	int age();

}
