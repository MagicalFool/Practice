package practice017_fastjson;

public class Entity {

    private String h;

    private String d;

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "h='" + h + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
