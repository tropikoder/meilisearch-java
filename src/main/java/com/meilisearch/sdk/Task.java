package com.meilisearch.sdk;

import com.google.gson.Gson;
import java.util.Date;
import lombok.Getter;

/** MeiliSearch response for a Task */
@Getter
public class Task {
    protected String status = "";
    protected int uid = 0;
    protected String indexUid = "";
    protected String type = null;
    protected String duration = "";
    protected Date enqueuedAt = null;
    protected Date startedAt = null;
    protected Date finishedAt = null;
    protected TaskError error = null;
    protected Details details = null;

    private static Gson gsonTask = new Gson();

    /**
     * Method to return the JSON String of the Task
     *
     * @return JSON string of the Task object
     */
    @Override
    public String toString() {
        return gsonTask.toJson(this);
    }
}
