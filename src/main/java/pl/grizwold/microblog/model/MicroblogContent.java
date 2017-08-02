package pl.grizwold.microblog.model;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public interface MicroblogContent {
    Long getId();

    String getAuthor();

    UserGroup getAuthorGroup();

    String getAuthorAvatar();

    String getAuthorAvatarBig();

    String getAuthorAvatarMed();

    String getAuthorAvatarLow();

    UserSex getAuthorSex();

    String getApp();

    DateTime getDateAdded();

    Embed getEmbed();

    String getBody();

    String getUrl();

    int getVoteCount();

    List<User> getVoters();

    Set<Tag> getTags();

    EntryType getType();

    boolean isDeleted();
}
