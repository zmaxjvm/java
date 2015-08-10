package com.zmax.dto;

import java.io.Serializable;

/**
 * Created by zmax.
 */
public class ChatMessage implements Serializable {
    private String publisherUserId;
    private String consumerUserId;
    private String message;

    public String getPublisherUserId() {
        return publisherUserId;
    }

    public void setPublisherUserId(String publisherUserId) {
        this.publisherUserId = publisherUserId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getConsumerUserId() {
        return consumerUserId;
    }

    public void setConsumerUserId(String consumerUserId) {
        this.consumerUserId = consumerUserId;
    }
}
