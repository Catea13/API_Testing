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

public class Get200 extends BaseClass {


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
    public void baseUrlReturns200() throws IOException {
        HttpGet get=new HttpGet(BASE_ENDPOINT);
        response=client.execute(get);
        int actualStatus=response.getStatusLine().getStatusCode();
        assertEquals(actualStatus,200);
    }

    @Test
    public void rateLimitReturns200() throws IOException {
        HttpGet get = new HttpGet("https://api.github.com/rate_limit");
        this.response = this.client.execute(get);
        int actualStatus = this.response.getStatusLine().getStatusCode();
        AssertJUnit.assertEquals(actualStatus, 200);

    }

    @Test
    public void repositorySearchUrlReturns200() throws IOException {
        HttpGet get = new HttpGet("https://api.github.com/search/repositories?q=java");
        this.response = this.client.execute(get);
        int actualStatus = this.response.getStatusLine().getStatusCode();
        AssertJUnit.assertEquals(actualStatus, 200);

    }
}
