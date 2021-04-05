package Laborator;
import entities.BaseClass;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Status {


    CloseableHttpClient client;
    CloseableHttpResponse response;
//
    @BeforeMethod
   public void setup() {
    client = HttpClientBuilder.create().build();
   }

   @AfterMethod
    public void closeResources() throws IOException {
       client.close();
       response.close();
    }

    @Test
    public void EventsUrlReturns200() throws IOException {
        HttpGet get = new HttpGet("https://github.com/events");
        response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();
        assertEquals(actualStatus, 200);
    }
    @Test
    public void authorizations() throws IOException {
        HttpGet get = new HttpGet("https://github.com/authorizations");
        response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();
        assertEquals(actualStatus, 401);
    }
    @Test
    public void nonexistingname() throws IOException {
        HttpGet get = new HttpGet("https://github.com/notexistingname");
        response = client.execute(get);
        int actualStatus = response.getStatusLine().getStatusCode();
        assertEquals(actualStatus, 404);
    }
}
