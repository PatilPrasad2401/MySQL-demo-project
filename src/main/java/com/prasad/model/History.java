package com.prasad.model;

public class History {
    private int historyId;
    private String service_date;
    private String comments;

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public String getService_date() {
        return service_date;
    }

    public void setService_date(String service_date) {
        this.service_date = service_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", service_date='" + service_date + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
