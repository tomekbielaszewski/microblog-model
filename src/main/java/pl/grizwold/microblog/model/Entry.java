package pl.grizwold.microblog.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode(of = {"id"})
public class Entry implements MicroblogContent {
    private Long id;

    private String author;

    @SerializedName("author_group")
    private UserGroup authorGroup;

    @SerializedName("author_avatar")
    private String authorAvatar;

    @SerializedName("author_avatar_big")
    private String authorAvatarBig;

    @SerializedName("author_avatar_med")
    private String authorAvatarMed;

    @SerializedName("author_avatar_lo")
    private String authorAvatarLow;

    @SerializedName("author_sex")
    private UserSex authorSex;

    private String app;

    @SerializedName("date")
    private LocalDateTime dateAdded;

    private Embed embed;

    private String body;

    private String url;

    @SerializedName("vote_count")
    private int voteCount;

    @SerializedName("comment_count")
    private int commentCount;

    private List<EntryComment> comments;

    private List<User> voters;

    private EntryType type;

    private boolean deleted;
}
