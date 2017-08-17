package lab.process;

import com.sun.codemodel.JCodeModel;
import org.apache.commons.io.IOUtils;
import org.jsonschema2pojo.AnnotationStyle;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class JsonSchemaToPojo {

    public static void process(String jsonSchemaResourceName, String pojoClassName, String pojoPackageName) throws Exception {
        try(Reader jsonSchemaReader = new FileReader("src/main/resources/" + jsonSchemaResourceName)) {
            process(jsonSchemaReader, pojoClassName, pojoPackageName, "src/main/java");
        }
    }

    public static void process(Reader jsonSchema, String pojoClassName, String pojoPackageName, String pojoDestDirName) throws Exception {
        JCodeModel codeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public AnnotationStyle getAnnotationStyle() {
                return AnnotationStyle.JACKSON2;
            }
        };

        SchemaMapper mapper = new SchemaMapper(
                new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()),
                new SchemaGenerator()
        );
        mapper.generate(codeModel, pojoClassName, pojoPackageName, IOUtils.toString(jsonSchema));

        File pojoDestDir = new File(pojoDestDirName);
        pojoDestDir.mkdirs();
        codeModel.build(pojoDestDir);
    }
}
