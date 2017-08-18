package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import lab.helpers.ObjectMapperFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class PojoToJsonSchema {

    private static final ObjectMapper mapper = ObjectMapperFactory.create();

    public static void process(Class pojoClass, String jsonSchemaResourceName) throws Exception {
        File jsonSchemaResourceFile = new File("src/main/resources/" + jsonSchemaResourceName);
        jsonSchemaResourceFile.getParentFile().mkdirs();
        PojoToJsonSchema.process(pojoClass, new FileWriter("src/main/resources/" + jsonSchemaResourceName));
    }

    public static void process(Class pojoClass, Writer jsonSchemaWriter) throws Exception {
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(pojoClass);
        mapper.writeValue(jsonSchemaWriter, schema);
    }
}

