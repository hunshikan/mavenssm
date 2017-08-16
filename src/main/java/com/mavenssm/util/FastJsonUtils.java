package com.mavenssm.util;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtils {
	
	 public static void main(String[] args) {
        
		
	 }
	 private static final SerializeConfig config;  
	  
	    static {  
	        config = new SerializeConfig();  
	        config.put(java.util.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式  
	        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer()); // 使用和json-lib兼容的日期输出格式  
	    }  
	  
	    private static final SerializerFeature[] features = {SerializerFeature.WriteMapNullValue, // 输出空置字段  
	            SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null  
	            SerializerFeature.WriteNullNumberAsZero, // 数值字段如果为null，输出为0，而不是null  
	            SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null，输出为false，而不是null  
	            SerializerFeature.WriteNullStringAsEmpty // 字符类型字段如果为null，输出为""，而不是null  
	    };  
	      
	  
	    public static String toJSONString(Object object) {  
	        return JSON.toJSONString(object, config, features);  
	    }  
	      
	    public static String toJSONNoFeatures(Object object) {  
	        return JSON.toJSONString(object, config);  
	    }  
	      
	  
	  
	    public static Object toBean(String str) {  
	        return JSON.parse(str);  
	    }  
	  
	    /** 
	     * @Title: jtoObj
	     * @Description: 将JSON字符串转换为对象 
	     * @param text  //需要转换的字符串 
	     * @param clazz //转换时使用的实体类型 
	     * @return 
	     */  
	    public static <T> T toBean(String str, Class<T> clazz) {  
	        return JSON.parseObject(str, clazz);  
	    }  
	  
	    // 转换为数组  
	    public static <T> Object[] toArray(String str) {  
	        return toArray(str, null);  
	    }  
	  
	    // 转换为数组  
	    public static <T> Object[] toArray(String str, Class<T> clazz) {  
	        return JSON.parseArray(str, clazz).toArray();  
	    }  
	  
	    // 转换为List  
	    public static <T> List<T> toList(String str, Class<T> clazz) {  
	        return JSON.parseArray(str, clazz);  
	    }  
	  
	    /**  
	     * 将object转化为json字符串  
	     * @param obj  
	     * @return  
	     */  
	    public static String objToJson(Object obj) {  
	        String textJson = JSON.toJSONString(obj);    
	        return textJson;  
	    }  
	      
	    /**  
	     * 将string转化为序列化的json字符串  
	     * @param string 
	     * @return  object
	     */  
	    public static Object strToJson(String str) {  
	        Object objectJson  = JSON.parse(str);  
	        return objectJson;  
	    }  
	      
	    /**  
	     * json字符串转化为map  
	     * @param s  
	     * @return  
	     */  
	    public static Map JsonToCollect(String str) {  
	        Map m = JSONObject.parseObject(str);  
	        return m;  
	    }  
	      
	    /**  
	     * 将map转化为string  
	     * @param m  
	     * @return  
	     */  
	    public static String collectToString(Map m) {  
	        String str = JSONObject.toJSONString(m);  
	        return str;  
	    }  
}
