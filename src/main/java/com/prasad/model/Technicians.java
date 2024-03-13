package com.prasad.model;

public class Technicians {
    private int technicianId;
    private String first_name;
    private String last_name;
    private String specialization;

    public int getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Technicians{" +
                "technicianId=" + technicianId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
