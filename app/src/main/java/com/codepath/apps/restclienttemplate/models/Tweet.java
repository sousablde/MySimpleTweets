package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {
    //list out attributes
    public String body;
    public long uid; //database ID for the tweet
    public String createdAt;

    //there is a user object for each tweet so to support that I need a user class
    //public User user;

    //take JSON object and instantiate tweet object and deserialize the data
    //the method takes in a JSON object and gives back a tweet object
    public static Tweet fromJSON(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();

        //extract all the values from JSON
        //the body of the text will be tweet.body
        tweet.body = jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.createdAt = jsonObject.getString("created_at");
        return tweet;

    }
}
