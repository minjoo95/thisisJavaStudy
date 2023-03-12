package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //어노테이션 적용 범위 Target({배열형식})
@Retention(RetentionPolicy.RUNTIME) //어노테이션유지정책 Retention 
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
