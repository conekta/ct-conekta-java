package conekta.io.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import conekta.io.model.submodel.LineItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ListToPaginatedObject extends JsonSerializer<String> {
    @Override
    public void serialize(String object, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<LineItem> cosa = new ArrayList<>();

        List list = ConektaObjectMapper.getInstance().stringJsonToObject(object, cosa.getClass());
    }
}

