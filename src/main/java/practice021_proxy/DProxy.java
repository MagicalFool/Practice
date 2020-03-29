package practice021_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DProxy {

    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello() {

            System.out.println("hello");
        }
    }

    static class ProxyClass implements InvocationHandler{



        Object obj;

        Object bind(Object originObject){
            this.obj = originObject;
            return Proxy.newProxyInstance(originObject.getClass().getClassLoader(),obj.getClass().getInterfaces(),new ProxyClass());
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(obj,args);
        }
    }

    public static void main(String[] args) {
        IHello hello = (IHello) new ProxyClass().bind(new Hello());
        hello.sayHello();
    }
}
