package com.fullstackwebapp.springbootfileupload.model;

public class MessageResponse {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageResponse() {
    }

    public MessageResponse(String content) {
        this.content = content;
    }
}
