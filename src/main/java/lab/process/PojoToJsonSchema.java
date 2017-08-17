package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import java.io.IOException;
import java.io.Writer;

public class PojoToJsonSchema {

    public static void process(Class pojoClass, Writer writer) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema= schemaGen.generateSchema(pojoClass);
        mapper.writeValue(writer,schema);
    }
}

