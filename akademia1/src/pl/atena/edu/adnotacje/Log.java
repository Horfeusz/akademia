/**
 * 
 */
package pl.atena.edu.adnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface Log {

	LogSource type() default LogSource.CONSOLA;

	String[] messages() default {};

}
