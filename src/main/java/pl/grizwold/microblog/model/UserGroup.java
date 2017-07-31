package pl.grizwold.microblog.model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public enum UserGroup {
    @SerializedName("0")
    GREEN,

    @SerializedName("1")
    ORANGE,

    @SerializedName("2")
    RED,

    @SerializedName("1001")
    SILVER,

    @SerializedName("5")
    BLACK,

    @SerializedName("2001")
    BLUE,

    @SerializedName("1002")
    DELETED
}
