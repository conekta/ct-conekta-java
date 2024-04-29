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
import java.util.Map;
import java.util.HashMap;
import com.conekta.model.PaymentMethodCardRequest;
import com.conekta.model.PaymentMethodCashRequest;
import com.conekta.model.PaymentMethodSpeiRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
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
@JsonDeserialize(using = CustomerPaymentMethodsRequest.CustomerPaymentMethodsRequestDeserializer.class)
@JsonSerialize(using = CustomerPaymentMethodsRequest.CustomerPaymentMethodsRequestSerializer.class)
public class CustomerPaymentMethodsRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomerPaymentMethodsRequest.class.getName());

    public static class CustomerPaymentMethodsRequestSerializer extends StdSerializer<CustomerPaymentMethodsRequest> {
        public CustomerPaymentMethodsRequestSerializer(Class<CustomerPaymentMethodsRequest> t) {
            super(t);
        }

        public CustomerPaymentMethodsRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(CustomerPaymentMethodsRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CustomerPaymentMethodsRequestDeserializer extends StdDeserializer<CustomerPaymentMethodsRequest> {
        public CustomerPaymentMethodsRequestDeserializer() {
            this(CustomerPaymentMethodsRequest.class);
        }

        public CustomerPaymentMethodsRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CustomerPaymentMethodsRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PaymentMethodCardRequest
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCardRequest'", e);
            }

            // deserialize PaymentMethodCashRequest
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodCashRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCashRequest'", e);
            }

            // deserialize PaymentMethodSpeiRequest
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodSpeiRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodSpeiRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodSpeiRequest'", e);
            }

            if (match == 1) {
                CustomerPaymentMethodsRequest ret = new CustomerPaymentMethodsRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CustomerPaymentMethodsRequest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CustomerPaymentMethodsRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CustomerPaymentMethodsRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public CustomerPaymentMethodsRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CustomerPaymentMethodsRequest(PaymentMethodCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CustomerPaymentMethodsRequest(PaymentMethodCashRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CustomerPaymentMethodsRequest(PaymentMethodSpeiRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodCardRequest", new GenericType<PaymentMethodCardRequest>() {
        });
        schemas.put("PaymentMethodCashRequest", new GenericType<PaymentMethodCashRequest>() {
        });
        schemas.put("PaymentMethodSpeiRequest", new GenericType<PaymentMethodSpeiRequest>() {
        });
        JSON.registerDescendants(CustomerPaymentMethodsRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CustomerPaymentMethodsRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentMethodCardRequest, PaymentMethodCashRequest, PaymentMethodSpeiRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PaymentMethodCardRequest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodCashRequest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PaymentMethodSpeiRequest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodCardRequest, PaymentMethodCashRequest, PaymentMethodSpeiRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodCardRequest, PaymentMethodCashRequest, PaymentMethodSpeiRequest
     *
     * @return The actual instance (PaymentMethodCardRequest, PaymentMethodCashRequest, PaymentMethodSpeiRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCardRequest`. If the actual instance is not `PaymentMethodCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCardRequest`
     * @throws ClassCastException if the instance is not `PaymentMethodCardRequest`
     */
    public PaymentMethodCardRequest getPaymentMethodCardRequest() throws ClassCastException {
        return (PaymentMethodCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCashRequest`. If the actual instance is not `PaymentMethodCashRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCashRequest`
     * @throws ClassCastException if the instance is not `PaymentMethodCashRequest`
     */
    public PaymentMethodCashRequest getPaymentMethodCashRequest() throws ClassCastException {
        return (PaymentMethodCashRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodSpeiRequest`. If the actual instance is not `PaymentMethodSpeiRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodSpeiRequest`
     * @throws ClassCastException if the instance is not `PaymentMethodSpeiRequest`
     */
    public PaymentMethodSpeiRequest getPaymentMethodSpeiRequest() throws ClassCastException {
        return (PaymentMethodSpeiRequest)super.getActualInstance();
    }

}

