package lab.pojo2jsonschema;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import com.fasterxml.jackson.module.jsonSchema.types.ContainerTypeSchema;
import lab.pojo2jsonschema.model.sendgrid.*;
import lab.pojo2jsonschema.model.sendgrid.expanded.SendgridEvent;

import java.util.Map;

public class PojoToJsonSchema {

    //TODO: Bad required format in schema generated :(
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schemaClick = schemaGen.generateSchema(ClickEvent.class);
        JsonSchema schemaOpen = schemaGen.generateSchema(OpenEvent.class);
        JsonSchema schemaDelivery = schemaGen.generateSchema(DeliveryEvent.class);
        JsonSchema schemaWebhookEventBase = schemaGen.generateSchema(WebhookEventBase.class);
        JsonSchema schemaEngagementEventBase = schemaGen.generateSchema(EngagementEventBase.class);
        JsonSchema schemaSendgridEvent = schemaGen.generateSchema(SendgridEvent.class);


        String schemaClickString = mapper.writeValueAsString(schemaClick);
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


    }
}

