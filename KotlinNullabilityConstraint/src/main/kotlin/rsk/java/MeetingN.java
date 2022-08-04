package rsk.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MeetingN {
    private String title;

    public void addTitle(@NotNull String title) {
        this.title = title;
    }

    public @Nullable String meetingTitle() {
        return title;
    }

    public String titleCanBeNull() {
        return title;
    }
}
