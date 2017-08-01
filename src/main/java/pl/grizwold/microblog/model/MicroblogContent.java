package pl.grizwold.microblog.model;

import java.time.LocalDateTime;
import java.util.List;

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

    LocalDateTime getDateAdded();

    Embed getEmbed();

    String getBody();

    String getUrl();

    int getVoteCount();

    List<User> getVoters();

    EntryType getType();

    boolean isDeleted();
}
