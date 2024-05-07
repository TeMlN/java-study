package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface CustomAnnotation {

    Dialect dialect() default Dialect.MY_SQL8;
    int ttl() default 12800;
}