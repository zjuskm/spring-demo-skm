package com.skm.utils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class JsonUtil {
    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static ObjectMapper objectMapper=new ObjectMapper();

    public static Map<String,String> parseJsonToMapString(String json){
        Map<String,String> result= Maps.newHashMap();
        if(json==null)return result;
        JsonNode root=null;
        try{
            root=objectMapper.readTree(json);
        }catch (Exception e){
            logger.error("json error:",e);
        }
        if(root!=null){
            Iterator<String> it=root.fieldNames();
            while(it.hasNext()){
                String name=it.next();
                result.put(name,root.get(name).asText());
            }
        }
        return result;
    }

    public static Map<Long,Long> parseJsonToMap(String json){
        Map<Long,Long> result= Maps.newHashMap();
        if(json==null)return result;
        JsonNode root=null;
        try{
            root=objectMapper.readTree(json);
        }catch (Exception e){
            logger.error("json error:",e);
        }
        if(root!=null){
            Iterator<String> it=root.fieldNames();
            while(it.hasNext()){
                String name=it.next();
                result.put(Long.parseLong(name),root.get(name).asLong());
            }
        }
        return result;
    }

    public static Map<Integer,String> parseJsonToMapIntegerString(String json){
        Map<Integer,String> result= Maps.newHashMap();
        if(json==null)return result;
        JsonNode root=null;
        try{
            root=objectMapper.readTree(json);
        }catch (Exception e){
            logger.error("json error:",e);
        }
        if(root!=null){
            Iterator<String> it=root.fieldNames();
            while(it.hasNext()){
                String name=it.next();
                JsonNode value=root.get(name);
                result.put(Integer.parseInt(name),value.asText());
            }
        }
        return result;
    }

    public static String obj2String(Object obj){
        String result="";
        try{
            result=objectMapper.writeValueAsString(obj);
        }catch (Exception e){

        }
        return result;
    }

    public static <T> T string2obj(String content, Class<T> valueType) throws IOException {
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonFactory factory = new JsonFactory();
        JsonParser jsonpParser = factory.createParser(content);
        if (jsonpParser.nextToken() == JsonToken.START_OBJECT) {
            return objectMapper.readValue(jsonpParser, valueType);
        } else {
            return null;
        }
    }

    public static String writeJson2String(Object obj)
            throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }
}

