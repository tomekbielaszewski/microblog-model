package pl.grizwold.microblog.helper;

import pl.grizwold.microblog.model.Tag;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {

    public Set<Tag> extract(String body) {
        Set<Tag> tags = new HashSet<>();
        Pattern p = Pattern.compile("(\\s|^)#\\w{2,}", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(body);

        while (m.find()) {
            tags.add(Tag.builder().name(m.group().trim().replaceAll("#", "")).build());
        }

        return tags;
    }
}
