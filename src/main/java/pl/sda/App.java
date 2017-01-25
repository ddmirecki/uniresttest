package pl.sda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnirestException, IOException {
        String response = Unirest.
                get("http://192.168.2.17:8080/customers/sdfsdf").asString().getBody();

        System.out.println(response);

        ObjectMapper objectMapper = new ObjectMapper();
        Customer customer = objectMapper.readValue(response, Customer.class);
        System.out.println(customer);

//        String json = "{\n" +
//                "\"firstName\": \"Adam\",\n" +
//                "\"lastName\": \"Pierdziewicz\",\n" +
//                "\"birthYear\": 1798,\n" +
//                "\"height\": 1.7,\n" +
//                "\"id\": \"88a195dc-1c64-4c1c-8288-cce25f686660\"\n" +
//                "}";

//        String postResponse = Unirest.post("http://192.168.2.17:8080/customers/Daniel")
//                .header("Content-Type", "application/json").body(json).asString().getBody();
//        System.out.println(postResponse);


    }
}
