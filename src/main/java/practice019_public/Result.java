package practice019_public;

public class Result {

    public static Result result = new Result();

    private int i;

    private String message;

    private Object data;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
