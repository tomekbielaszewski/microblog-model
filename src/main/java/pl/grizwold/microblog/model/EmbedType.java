package pl.grizwold.microblog.model;

import com.google.gson.annotations.SerializedName;

public enum EmbedType {
    @SerializedName("image")
    IMAGE,

    @SerializedName("video")
    VIDEO
}
