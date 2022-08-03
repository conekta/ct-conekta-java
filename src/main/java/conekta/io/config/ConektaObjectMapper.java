package conekta.io.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import conekta.io.model.ConektaObject;

public class ConektaObjectMapper {

    private static ConektaObjectMapper conektaObjectMapper = null;
    private ObjectMapper objectMapper = null;

    public static ConektaObjectMapper getInstance() {
        if (conektaObjectMapper == null) {
            conektaObjectMapper = new ConektaObjectMapper();
        }
        return conektaObjectMapper;
    }

    private ConektaObjectMapper() {
        objectMapper = new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public String conektaObjectToString(ConektaObject conektaObject) throws JsonProcessingException {
        return objectMapper.writeValueAsString(conektaObject);
    }

    public ConektaObject stringJsonToConektaObject(String conektaJsonStr) throws JsonProcessingException {
        return objectMapper.readValue(conektaJsonStr, ConektaObject.class);
    }

    public <T> T stringJsonToObject(String jsonStr, Class<T> valueType) throws JsonProcessingException {
        return objectMapper.readValue(jsonStr, valueType);
    }

    public <T> T stringJsonToObject(String jsonStr, TypeReference<T> valueType) throws JsonProcessingException {
        return objectMapper.readValue(jsonStr, valueType);
    }
}
