package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import lab.helpers.ObjectMapperFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class PojoToJson {

    private static final ObjectMapper mapper = ObjectMapperFactory.create();

    public static void process(Object pojo, String jsonResourceName) throws Exception {
        File jsonResourceFile = new File("src/main/resources/" + jsonResourceName);
        jsonResourceFile.getParentFile().mkdirs();
        process(pojo, new FileWriter(jsonResourceFile));
    }

    public static void process(Object pojo, Writer jsonWriter) throws Exception {
        mapper.writeValue(jsonWriter, pojo);
    }
}
