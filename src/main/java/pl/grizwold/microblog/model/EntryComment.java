package pl.grizwold.microblog.model;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import org.joda.time.DateTime;
import pl.grizwold.microblog.helper.TagExtractor;

import java.util.List;
import java.util.Set;

@Data
@Builder
public class EntryComment implements MicroblogContent {
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
    private DateTime dateAdded;

    private Embed embed;

    private String body;

    private String url;

    @SerializedName("vote_count")
    private int voteCount;

    private List<User> voters;

    @SerializedName("entry_id")
    private Long entryId;

    private EntryType type;

    private boolean deleted;

    public Set<Tag> getTags() {
        return new TagExtractor().extract(this.getBody());
    }
}
