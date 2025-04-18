/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.conekta.model.PaymentMethodCardResponse;
import com.conekta.model.PaymentMethodCashResponse;
import com.conekta.model.PaymentMethodCashResponseAllOfAgreements;
import com.conekta.model.PaymentMethodSpeiRecurrent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.conekta.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
@JsonDeserialize(using = CreateCustomerPaymentMethodsResponse.CreateCustomerPaymentMethodsResponseDeserializer.class)
@JsonSerialize(using = CreateCustomerPaymentMethodsResponse.CreateCustomerPaymentMethodsResponseSerializer.class)
public class CreateCustomerPaymentMethodsResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCustomerPaymentMethodsResponse.class.getName());

    public static class CreateCustomerPaymentMethodsResponseSerializer extends StdSerializer<CreateCustomerPaymentMethodsResponse> {
        public CreateCustomerPaymentMethodsResponseSerializer(Class<CreateCustomerPaymentMethodsResponse> t) {
            super(t);
        }

        public CreateCustomerPaymentMethodsResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateCustomerPaymentMethodsResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateCustomerPaymentMethodsResponseDeserializer extends StdDeserializer<CreateCustomerPaymentMethodsResponse> {
        public CreateCustomerPaymentMethodsResponseDeserializer() {
            this(CreateCustomerPaymentMethodsResponse.class);
        }

        public CreateCustomerPaymentMethodsResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateCustomerPaymentMethodsResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            CreateCustomerPaymentMethodsResponse newCreateCustomerPaymentMethodsResponse = new CreateCustomerPaymentMethodsResponse();
            Map<String, Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "card":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "cash":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "cash_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "oxxo_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "spei_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRecurrent.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "payment_method_card_response":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "payment_method_cash_response":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                case "payment_method_spei_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRecurrent.class);
                    newCreateCustomerPaymentMethodsResponse.setActualInstance(deserialized);
                    return newCreateCustomerPaymentMethodsResponse;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for CreateCustomerPaymentMethodsResponse. Possible values: card cash cash_recurrent oxxo_recurrent spei_recurrent payment_method_card_response payment_method_cash_response payment_method_spei_recurrent", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PaymentMethodCashResponse
            try {
                boolean attemptParsing = true;
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

            // deserialize PaymentMethodCardResponse
            try {
                boolean attemptParsing = true;
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

            // deserialize PaymentMethodSpeiRecurrent
            try {
                boolean attemptParsing = true;
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
                CreateCustomerPaymentMethodsResponse ret = new CreateCustomerPaymentMethodsResponse();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateCustomerPaymentMethodsResponse: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateCustomerPaymentMethodsResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateCustomerPaymentMethodsResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public CreateCustomerPaymentMethodsResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCustomerPaymentMethodsResponse(PaymentMethodCashResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCustomerPaymentMethodsResponse(PaymentMethodCardResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCustomerPaymentMethodsResponse(PaymentMethodSpeiRecurrent o) {
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
        JSON.registerDescendants(CreateCustomerPaymentMethodsResponse.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("card", PaymentMethodCardResponse.class);
        mappings.put("cash", PaymentMethodCashResponse.class);
        mappings.put("cash_recurrent", PaymentMethodCashResponse.class);
        mappings.put("oxxo_recurrent", PaymentMethodCashResponse.class);
        mappings.put("spei_recurrent", PaymentMethodSpeiRecurrent.class);
        mappings.put("payment_method_card_response", PaymentMethodCardResponse.class);
        mappings.put("payment_method_cash_response", PaymentMethodCashResponse.class);
        mappings.put("payment_method_spei_recurrent", PaymentMethodSpeiRecurrent.class);
        mappings.put("create_customer_payment_methods_response", CreateCustomerPaymentMethodsResponse.class);
        JSON.registerDiscriminator(CreateCustomerPaymentMethodsResponse.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateCustomerPaymentMethodsResponse.schemas;
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
        if (JSON.isInstanceOf(PaymentMethodCashResponse.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodCardResponse.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodSpeiRecurrent.class, instance, new HashSet<>())) {
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

