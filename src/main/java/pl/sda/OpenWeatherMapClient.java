package pl.sda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-01-25.
 */
public class OpenWeatherMapClient {
    public static void main(String[] args) throws UnirestException {

        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println("podaj nazwe miasta chuju");
        String city = new Scanner(System.in).nextLine();

//        String response = Unirest.get("http://api.openweathermap.org/data/2.5/weather").queryString("q",city + ".pl").queryString("appid", "54a3f9465a940802bd5e99871e0bfcf6")
//                .asString().getBody();

        Weather weather = Unirest.get("http://api.openweathermap.org/data/2.5/weather").queryString("q",city + ".pl").queryString("appid", "54a3f9465a940802bd5e99871e0bfcf6")
                .asObject(Weather.class).getBody();
        System.out.println(weather);


    }
}
