package com.prasad.model;

public class Requests {
    private int requestId;
    private String request_date;
    private String status;
    private String description;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getRequest_date() {
        return request_date;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceRequests{" +
                "requestId=" + requestId +
                ", request_date='" + request_date + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    }
