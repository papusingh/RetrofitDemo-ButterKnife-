package androidbuffer.com.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by incred-dev on 26/6/18.
 */

public class RetrofitModel {

    @SerializedName("id")
    private String Id;

    @SerializedName("name")
    private String Name;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
