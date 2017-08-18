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

    private static final JCodeModel codeModel = new JCodeModel();

    public static void process(String jsonSchemaResourceName, String pojoClassName, String pojoPackageName) throws Exception {
        try(Reader jsonSchemaReader = new FileReader("src/main/resources/" + jsonSchemaResourceName)) {
            process(jsonSchemaReader, pojoClassName, pojoPackageName, "src/main/java");
        }
    }

    public static void process(Reader jsonSchemaReader, String pojoClassName, String pojoPackageName, String pojoDestDirName) throws Exception {

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public AnnotationStyle getAnnotationStyle() {
                return AnnotationStyle.JACKSON2;
            }

            @Override
            public boolean isIncludeJsr303Annotations() {
                return true;
            }

            @Override
            public boolean isIncludeJsr305Annotations() {
                return false;
            }

            @Override
            public boolean isIncludeAdditionalProperties() {
                return false;
            }
        };

        SchemaMapper mapper = new SchemaMapper(
                new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()),
                new SchemaGenerator()
        );
        mapper.generate(codeModel, pojoClassName, pojoPackageName, IOUtils.toString(jsonSchemaReader));

        File pojoDestDir = new File(pojoDestDirName);
        pojoDestDir.mkdirs();
        codeModel.build(pojoDestDir);
    }
}
