package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import lab.helpers.ObjectMapperFactory;

import java.io.FileReader;
import java.io.Reader;

public class Json2Pojo {

    private static final ObjectMapper mapper = ObjectMapperFactory.create();

    public static <T> T process(String jsonResourceName, Class<T> pojoClass) throws Exception {
        return process(new FileReader("src/main/resources/" + jsonResourceName), pojoClass);
    }

    public static <T> T process(Reader jsonReader, Class<T> pojoClass) throws Exception {
        return mapper.readValue(jsonReader, pojoClass);
    }

}
