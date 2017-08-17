package lab.process;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import lab.model.sendgrid.*;
import lab.model.sendgrid.expanded.SendgridEvent;

import java.io.File;
import java.io.IOException;

public class PojoToJsonSchema {

    //TODO: Bad required format in schema generated :(
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schemaClick = schemaGen.generateSchema(ClickEvent.class);
        JsonSchema schemaOpen = schemaGen.generateSchema(OpenEvent.class);
        JsonSchema schemaDelivery = schemaGen.generateSchema(DeliveryEvent.class);
        JsonSchema schemaWebhookEventBase = schemaGen.generateSchema(WebhookEventBase.class);
        JsonSchema schemaEngagementEventBase = schemaGen.generateSchema(EngagementEventBase.class);
        JsonSchema schemaSendgridEvent = schemaGen.generateSchema(SendgridEvent.class);


        File clickFile = new File("src/main/resources/click.jsonschema.json");
        mapper.writeValue(clickFile,schemaClick);

        File openFile = new File("src/main/resources/open.jsonschema.json");
        mapper.writeValue(openFile,schemaOpen);

        File deliveredFile = new File("src/main/resources/delivered.jsonschema.json");
        mapper.writeValue(deliveredFile,schemaDelivery);


        /*String schemaClickString = mapper.writeValueAsString(schemaClick);
        String schemaOpenString = mapper.writeValueAsString(schemaOpen);
        String schemaDeliveryString = mapper.writeValueAsString(schemaDelivery);
        String schemaWebhookEventBaseString = mapper.writeValueAsString(schemaWebhookEventBase);
        String schemaEngagementEventBaseString = mapper.writeValueAsString(schemaEngagementEventBase);
        String schemaSengridEvent = mapper.writeValueAsString(schemaSendgridEvent);


        System.out.println("CLICK  :"+schemaClickString);
        System.out.println("OPEN:  "+schemaOpenString);
        System.out.println("DELIVERED:  "+schemaDeliveryString);
        System.out.println("ABSTRACT BASE: "+schemaWebhookEventBaseString);
        System.out.println("ENGAGEMENT BASE: "+schemaEngagementEventBaseString);
        System.out.println("EVENT: "+schemaSengridEvent);
        */


    }
}

