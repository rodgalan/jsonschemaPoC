package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import lab.model.sendgrid.*;
import lab.model.sendgrid.expanded.SendgridEvent;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class PojoToJsonSchema {

    public static void process(Object bean, Writer writer) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema= schemaGen.generateSchema(bean.getClass());
        mapper.writeValue(writer,schema);
    }
}

