package practice024_reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;

/**
 * Class 类的方法
 */
@Test
public class Demo02 {

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        Class<? extends Demo02> aClass = demo02.getClass();
        //1.getAnnotatedInterfaces
        AnnotatedType[] annotatedInterfaces = aClass.getAnnotatedInterfaces();
//        String typeName = annotatedInterfaces[0].getType().getTypeName();
        System.out.println(annotatedInterfaces.length);

        //2.getAnnotatedSuperclass
        AnnotatedType annotatedSuperclass = aClass.getAnnotatedSuperclass();

        //3.getAnnotations()
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(annotations.length);
        //4.
        String canonicalName = aClass.getCanonicalName();
        System.out.println(canonicalName);

        //5.
        boolean b = aClass.desiredAssertionStatus();
        System.out.println(b);

        //6.
    }
}
