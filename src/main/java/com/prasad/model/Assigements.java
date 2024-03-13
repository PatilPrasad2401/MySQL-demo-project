package com.prasad.model;

public class Assigements {
    private int assignmentId;
    private String assignment_date ;
    private String status;

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignment_date() {
        return assignment_date;
    }

    public void setAssignment_date(String assignment_date) {
        this.assignment_date = assignment_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Assigements{" +
                "assignmentId=" + assignmentId +
                ", assignment_date='" + assignment_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
