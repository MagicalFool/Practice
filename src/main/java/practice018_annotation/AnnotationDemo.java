package practice018_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class AnnotationDemo {

    @hello(name = "abc")
    private String hello;

    public void add(){}

    @Override
    public String toString() {
        return "AnnotationDemo{}";
    }

    public static void main(String[] args) {

        try {
            Class clz = Class.forName("practice018_annotation.AnnotationDemo");
            Field[] fields = clz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                practice018_annotation.hello hello = field.getDeclaredAnnotation(practice018_annotation.hello.class);
                System.out.println(field.getName() + hello.name());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface hello{

    String name();
}


