package pl.sda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-01-25.
 */
public class AppJackson {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);



        // ZAMIANA OBIEKTU NA JSON
//        Customer customer = new Customer("Adam", "Kowalski", 1980, 123, new Date());
//        String customerJson = objectMapper.writeValueAsString(customer);
//        System.out.println(customerJson);

        // ZAMIANA JSONa na obiekt
//        String json = "{\n" +
//                "  \"firstName\" : \"Adam\",\n" +
//                "  \"lastName\" : \"Kowalski\",\n" +
//                "  \"birthYear\" : 1980,\n" +
//                "  \"idNumber\" : 123\n" +
//                "}";
//        Customer customer1 = objectMapper.readValue(json, Customer.class);

//        Map<String, String> stringStringMap = new HashMap<>();
//        stringStringMap.put("A", "B");
//        stringStringMap.put("C", "D");
//
//        String jsonMap = objectMapper.writeValueAsString(stringStringMap);
//        System.out.println(jsonMap);

    }
}

