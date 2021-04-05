package entities;



import java.util.Date;

public class User {

    //For tests using JsonObject
    public static final String LOGIN = "login";
    public static final String ID = "id";
    public  static  final String NODE_ID="MDQ6VXNlcjU4ODQyMjkz";
    public static final String AVANTAR_URL="https://avatars.githubusercontent.com/u/58842293?v=4";
    public static final String HTML_URL="https://github.com/Catea13";
    public static final String followers_url="https://api.github.com/users/Catea13/followers";
    private String login;
    private int id;
    private  String  node_id;
    private String gravatar_id;
    private String url;
    public String following_url;
    public String starred_url;
    public String getLogin() {
        return login;
    }
    public String  gists_url;
    public String repos_url;
    public String subscriptions_url;
    public String organizations_url;
    public String events_url;
    public String received_events_url;
    public  String type;
    public boolean site_admin;
    public String name;
    public String company;
    public String blog;
    public String location;
    public String email;
    public String hireable;
    public  String bio;
    public String twitter_username;
    public int public_repos;
    public int public_gists;
    public int followers;
    public int following;
    public String created_at;
    public String updated_at;

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getBio() {
        return bio;
    }

    public int getFollowing() {
        return following;
    }

    public int getFollowers() {
        return followers;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public String getEmail() {
        return email;
    }

    public String getHireable() {
        return hireable;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public static String getLOGIN() {
        return LOGIN;
    }

    public boolean isSite_admin() {
        return site_admin;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public int getId() {
        return id;
    }

    public static String getAvantarUrl() {
        return AVANTAR_URL;
    }

    public static String getFollowers_url() {
        return followers_url;
    }

    public static String getHtmlUrl() {
        return HTML_URL;
    }

    public static String getNodeId() {
        return NODE_ID;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }
}
