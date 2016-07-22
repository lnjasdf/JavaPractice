package practice.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by lnjasdf on 2016/7/22.
 */
public class JsonMain {

    public static void main(String[] arg) throws JsonProcessingException {
        DataPo aaa = new DataPo("aaa", 28, 17.8f);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(aaa));
    }
}
