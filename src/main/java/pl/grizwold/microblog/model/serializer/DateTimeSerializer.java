package pl.grizwold.microblog.model.serializer;

import com.google.gson.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.lang.reflect.Type;

public class DateTimeSerializer implements JsonSerializer<DateTime>, JsonDeserializer<DateTime> {
    @Override
    public DateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (json.getAsString() == null || json.getAsString().isEmpty()) {
            return null;
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        return fmt.parseDateTime(json.getAsString());
    }

    @Override
    public JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        return new JsonPrimitive(fmt.print(dateTime));
    }
}
