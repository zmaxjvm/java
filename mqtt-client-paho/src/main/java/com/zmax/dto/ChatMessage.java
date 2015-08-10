package com.zmax.dto;

import java.io.Serializable;

/**
 * Created by zmax.
 */
public class ChatMessage implements Serializable {
    private String publisherId;
    private String consumerId;
    private String message;

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }
}
