import entities.BaseClass;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Get401 extends BaseClass {

    CloseableHttpClient client;
    CloseableHttpResponse response;

    @BeforeMethod
    public void setup() {
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client.close();
        response.close();
    }

    @DataProvider
    private Object[][] endpoints() {
        return new Object[][]{{
                "/user"

        },
                {
                        "/user/followers"
                },
                {
                        "/notifications"
                }
        };
    }

    @Test(dataProvider = "endpoints")
    public void userReturns401() throws IOException {
        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/user");

        response = client.execute(httpGet);
        int statusCode = response.getStatusLine().getStatusCode();
        assertEquals(statusCode, 401);


    }


    @Test
    public void userReturns401B() throws IOException {
        HttpGet httpGet = new HttpGet(BASE_ENDPOINT + "/user/followers");

        response = client.execute(httpGet);
        int statusCode = response.getStatusLine().getStatusCode();
        assertEquals(statusCode, 401);


    }
}

//    @Test
//    public void userReturns401C () throws IOException {
//        HttpGet httpGet=new HttpGet(BASE_ENDPOINT+"/notifications");
//
//        response=client.execute(httpGet);
//        int statusCode=response.getStatusLine().getStatusCode();
//        assertEquals(statusCode,401);
//
//
//    }
//
//}

