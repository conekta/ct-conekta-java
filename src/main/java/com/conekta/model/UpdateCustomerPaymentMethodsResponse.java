/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodSpeiRecurrent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.conekta.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T11:12:04.718851-03:00[America/Argentina/Buenos_Aires]")
@JsonDeserialize(using = UpdateCustomerPaymentMethodsResponse.UpdateCustomerPaymentMethodsResponseDeserializer.class)
@JsonSerialize(using = UpdateCustomerPaymentMethodsResponse.UpdateCustomerPaymentMethodsResponseSerializer.class)
public class UpdateCustomerPaymentMethodsResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateCustomerPaymentMethodsResponse.class.getName());

    public static class UpdateCustomerPaymentMethodsResponseSerializer extends StdSerializer<UpdateCustomerPaymentMethodsResponse> {
        public UpdateCustomerPaymentMethodsResponseSerializer(Class<UpdateCustomerPaymentMethodsResponse> t) {
            super(t);
        }

        public UpdateCustomerPaymentMethodsResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateCustomerPaymentMethodsResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateCustomerPaymentMethodsResponseDeserializer extends StdDeserializer<UpdateCustomerPaymentMethodsResponse> {
        public UpdateCustomerPaymentMethodsResponseDeserializer() {
            this(UpdateCustomerPaymentMethodsResponse.class);
        }

        public UpdateCustomerPaymentMethodsResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateCustomerPaymentMethodsResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            UpdateCustomerPaymentMethodsResponse newUpdateCustomerPaymentMethodsResponse = new UpdateCustomerPaymentMethodsResponse();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "card":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardResponse.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "cash":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "oxxo_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "payment_method_card_response":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardResponse.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "payment_method_cash_response":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "payment_method_spei_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRecurrent.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                case "spei_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRecurrent.class);
                    newUpdateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newUpdateCustomerPaymentMethodsResponse;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for UpdateCustomerPaymentMethodsResponse. Possible values: card cash oxxo_recurrent payment_method_card_response payment_method_cash_response payment_method_spei_recurrent spei_recurrent", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PaymentMethodCardResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PaymentMethodCardResponse.class.equals(Integer.class) || PaymentMethodCardResponse.class.equals(Long.class) || PaymentMethodCardResponse.class.equals(Float.class) || PaymentMethodCardResponse.class.equals(Double.class) || PaymentMethodCardResponse.class.equals(Boolean.class) || PaymentMethodCardResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PaymentMethodCardResponse.class.equals(Integer.class) || PaymentMethodCardResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PaymentMethodCardResponse.class.equals(Float.class) || PaymentMethodCardResponse.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PaymentMethodCardResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PaymentMethodCardResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodCardResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCardResponse'", e);
            }

            // deserialize PaymentMethodCashResponse
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PaymentMethodCashResponse.class.equals(Integer.class) || PaymentMethodCashResponse.class.equals(Long.class) || PaymentMethodCashResponse.class.equals(Float.class) || PaymentMethodCashResponse.class.equals(Double.class) || PaymentMethodCashResponse.class.equals(Boolean.class) || PaymentMethodCashResponse.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PaymentMethodCashResponse.class.equals(Integer.class) || PaymentMethodCashResponse.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PaymentMethodCashResponse.class.equals(Float.class) || PaymentMethodCashResponse.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PaymentMethodCashResponse.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PaymentMethodCashResponse.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodCashResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCashResponse'", e);
            }

            // deserialize PaymentMethodSpeiRecurrent
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PaymentMethodSpeiRecurrent.class.equals(Integer.class) || PaymentMethodSpeiRecurrent.class.equals(Long.class) || PaymentMethodSpeiRecurrent.class.equals(Float.class) || PaymentMethodSpeiRecurrent.class.equals(Double.class) || PaymentMethodSpeiRecurrent.class.equals(Boolean.class) || PaymentMethodSpeiRecurrent.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PaymentMethodSpeiRecurrent.class.equals(Integer.class) || PaymentMethodSpeiRecurrent.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PaymentMethodSpeiRecurrent.class.equals(Float.class) || PaymentMethodSpeiRecurrent.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PaymentMethodSpeiRecurrent.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PaymentMethodSpeiRecurrent.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRecurrent.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodSpeiRecurrent'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodSpeiRecurrent'", e);
            }

            if (match == 1) {
                UpdateCustomerPaymentMethodsResponse ret = new UpdateCustomerPaymentMethodsResponse();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateCustomerPaymentMethodsResponse: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateCustomerPaymentMethodsResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateCustomerPaymentMethodsResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateCustomerPaymentMethodsResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateCustomerPaymentMethodsResponse(PaymentMethodCardResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCustomerPaymentMethodsResponse(PaymentMethodCashResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCustomerPaymentMethodsResponse(PaymentMethodSpeiRecurrent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodCardResponse", new GenericType<PaymentMethodCardResponse>() {
        });
        schemas.put("PaymentMethodCashResponse", new GenericType<PaymentMethodCashResponse>() {
        });
        schemas.put("PaymentMethodSpeiRecurrent", new GenericType<PaymentMethodSpeiRecurrent>() {
        });
        JSON.registerDescendants(UpdateCustomerPaymentMethodsResponse.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("card", PaymentMethodCardResponse.class);
        mappings.put("cash", PaymentMethodCashResponse.class);
        mappings.put("oxxo_recurrent", PaymentMethodCashResponse.class);
        mappings.put("payment_method_card_response", PaymentMethodCardResponse.class);
        mappings.put("payment_method_cash_response", PaymentMethodCashResponse.class);
        mappings.put("payment_method_spei_recurrent", PaymentMethodSpeiRecurrent.class);
        mappings.put("spei_recurrent", PaymentMethodSpeiRecurrent.class);
        mappings.put("update_customer_payment_methods_response", UpdateCustomerPaymentMethodsResponse.class);
        JSON.registerDiscriminator(UpdateCustomerPaymentMethodsResponse.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateCustomerPaymentMethodsResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentMethodCardResponse, PaymentMethodCashResponse, PaymentMethodSpeiRecurrent
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PaymentMethodCardResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodCashResponse.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodSpeiRecurrent.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodCardResponse, PaymentMethodCashResponse, PaymentMethodSpeiRecurrent");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodCardResponse, PaymentMethodCashResponse, PaymentMethodSpeiRecurrent
     *
     * @return The actual instance (PaymentMethodCardResponse, PaymentMethodCashResponse, PaymentMethodSpeiRecurrent)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCardResponse`. If the actual instance is not `PaymentMethodCardResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCardResponse`
     * @throws ClassCastException if the instance is not `PaymentMethodCardResponse`
     */
    public PaymentMethodCardResponse getPaymentMethodCardResponse() throws ClassCastException {
        return (PaymentMethodCardResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCashResponse`. If the actual instance is not `PaymentMethodCashResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCashResponse`
     * @throws ClassCastException if the instance is not `PaymentMethodCashResponse`
     */
    public PaymentMethodCashResponse getPaymentMethodCashResponse() throws ClassCastException {
        return (PaymentMethodCashResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodSpeiRecurrent`. If the actual instance is not `PaymentMethodSpeiRecurrent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodSpeiRecurrent`
     * @throws ClassCastException if the instance is not `PaymentMethodSpeiRecurrent`
     */
    public PaymentMethodSpeiRecurrent getPaymentMethodSpeiRecurrent() throws ClassCastException {
        return (PaymentMethodSpeiRecurrent)super.getActualInstance();
    }

}

