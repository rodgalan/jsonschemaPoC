package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Writer;

public class PojoToJson {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void process(Object instance, Writer writer) throws IOException {
        mapper.writeValue(writer,instance);
    }
}
