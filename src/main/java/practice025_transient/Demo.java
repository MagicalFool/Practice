package practice025_transient;

import java.io.*;

/**
 * transient 用来指定不需要序列化的操作
 *
 * @author chenchao
 */
public class Demo implements Serializable {


    /**
     * 序列化的时候不会被序列化
     */
    private transient Integer integer;

    private String string;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        try {
            serializableClass();
            unSerializableClass();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void serializableClass() throws IOException {
        Demo demo = new Demo();

        demo.setInteger(1);
        demo.setString("test");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/home/chenchao/IdeaProjects/Practice/demo"));
        objectOutputStream.writeObject(demo);
        objectOutputStream.close();
        System.out.println("添加了transient关键字的属性序列化:" + demo.getInteger());

    }

    public static void unSerializableClass() throws IOException, ClassNotFoundException {

        File file = new File("/home/chenchao/IdeaProjects/Practice/demo");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        Demo o = (Demo) objectInputStream.readObject();

        System.out.println("添加了transient关键字的属性序列化:" + o.getInteger());

    }
}
