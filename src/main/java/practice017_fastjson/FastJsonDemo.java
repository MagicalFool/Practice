package practice017_fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

public class FastJsonDemo {

    public static void main(String[] args) {
        HashMap<String, Object> data = new HashMap<>();
        data.put("h",'a');
        data.put("d",'d');
        JSON json = new JSONObject(data);
        Entity entity = json.toJavaObject(Entity.class);
        System.out.println(entity);
    }
}
