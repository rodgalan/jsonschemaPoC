package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Reader;

public class Json2Pojo {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T process(Reader json, Class<T> pojoClass) throws IOException {
        return mapper.readValue(json,pojoClass);
    }

}
