package practice024_reflect;

/**
 * Class对象  三种获取方式 obj.getClass(), Class.forName(), Object.class
 */
public class Demo02 {

    public static void main(String[] args) {
        Demo02 obj = new Demo02();
        Class<?> aClass = obj.getClass();
        System.out.println("obj.getClass()->" + aClass);
        Class<Demo02> objectClass = Demo02.class;
        System.out.println("Object.class->" + objectClass);
        try {
            Class<?> aClass1 = Class.forName("practice024_reflect.Demo02");

            System.out.println("Class.forName->" + aClass1);

            System.out.println(aClass == objectClass);
            System.out.println(aClass == aClass1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
