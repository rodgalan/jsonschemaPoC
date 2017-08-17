package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Writer;

public class PojoToJson {

    public static void process(Object instance, Writer writer) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer,instance);
    }
}
