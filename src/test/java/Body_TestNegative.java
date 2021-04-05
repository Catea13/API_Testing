import entities.BaseClass;

import entities.ResponseUtils;
import entities.User;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Body_TestNegative extends BaseClass {

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

    @Test
    public void returnLogin() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getLogin(), "Catea133");

    }

    @Test
    public void returnID() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getId(), 588422960);

    }

    @Test
    public void returnNode_ID() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getNodeId(), "mDQ6VXNlcjU4ODQyMjkz");

    }

    @Test
    public void avatar_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getAvantarUrl(), "https://avatars.githubusercontent.com/u/58842293?v=");

    }

    @Test
    public void gravatar_id() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getGravatar_id(), null);
    }

    @Test
    public void url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getUrl(), "https://api.github.com/users/Catea3");
    }

    @Test
    public void html_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getHtmlUrl(), "https:/github.com/Catea13");
    }

    @Test
    public void followers_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getFollowers_url(), "https://api.github.com/user/Catea13/followers");
    }

    @Test
    public void gists_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getGists_url(), "https://api.github.com/users/Catea13/gists{/gist_idd}");
    }

    @Test
    public void getStarred_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getStarred_url(), "https://api.github.com/users/Catea13/starred{/owner}{/rep}");
    }

    @Test
    public void subscriptions_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getSubscriptions_url(), "https://api.github.com/users/Catea13/subscription");
    }

    @Test
    public void organizations_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getOrganizations_url(), "https://api.github.com/user/Catea13/orgs");
    }

    @Test
    public void repos_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getRepos_url(), "https://api.github.com/users/Catea13/repo");
    }

    @Test
    public void Events_URL() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getEvents_url(), "https://api.github.com/user/Catea13/events{/privacy}");
    }

    @Test
    public void received_events_url() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getReceived_events_url(), "https://api.github.com/user/Catea13/received_events");
    }

    @Test
    public void type() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getType(), "user");
    }

    @Test
    public void site_admin() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.isSite_admin(), true);
    }

    @Test
    public void name() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getName(), "null");
    }

    @Test
    public void company() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getCompany(), "null");
    }

    @Test
    public void blog() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getBlog(), "null");
    }
    @Test
    public void location() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getLocation(), "null");
    }
    @Test
    public void email() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getEmail(), "null");
    }
    @Test
    public void hireable() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getHireable(), "null");
    }
    @Test
    public void bio() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getBio(), "null");
    }
    @Test
    public void twitter_username() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getTwitter_username(), "Catea");
    }
    @Test
    public void public_repos() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getPublic_repos(), 36);
    }
    @Test
    public void public_gists() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getPublic_gists(), 35);
    }
    @Test
    public void followers() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getFollowers(), 10);
    }
    @Test
    public void following() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getFollowing(), 0.0);
    }
    @Test
    public void CreatedAt() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getCreated_at(), "2019-12-13T07:30:38");
    }
    @Test
    public void updated_at() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/Catea13");
        response = client.execute(get);
        User user = ResponseUtils.unmarshall(response, User.class);
        assertEquals(user.getUpdated_at(), "2020-03-14T12:50:48Z");
    }
}



