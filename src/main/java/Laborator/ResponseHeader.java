package Laborator;

import entities.ResponseUtils;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class ResponseHeader {
    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeMethod
    public void setup(){
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();
    }

    @Test
    public void contentTypeIsJson() throws IOException {
        HttpGet get=new HttpGet("https://github.com/events");
        response=client.execute(get);
        Header contentType=response.getEntity().getContentType();
        assertEquals(contentType.getValue(),"application/json; charset=utf-8");
        ContentType contentType1=ContentType.getOrDefault(response.getEntity());
        assertEquals(contentType1.getMimeType(),"application/json");

    }
    @Test
    public void idIs15713053856() throws IOException {
        HttpGet get = new HttpGet("https://api.github.com/events");
        this.response = this.client.execute(get);
         String headerValue = (ResponseUtils.getHeader(this.response, "id"));
        AssertJUnit.assertEquals(headerValue, "15767090031");
    }
    @Test
    public void headerDisabled() throws IOException {
        HttpGet get = new HttpGet("https://api.github.com/events");
        this.response = this.client.execute(get);
        Boolean disabled = ResponseUtils.headerIsPresent(this.response, "disabled");
        AssertJUnit.assertFalse(disabled);
    }


}

