package com.example.model;

import java.util.Date;

public class Leave {

    private String id;
    private int empno;
    private int leaveid;
    private Date leaveStartDate;
    private Date leaveEndDate;
    private int noOfDays;
    private String leaveReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(int leaveid) {
        this.leaveid = leaveid;
    }

    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public Leave() { }

    public Leave(String id, int empno, int leaveid, Date leaveStartDate, Date leaveEndDate, int noOfDays, String leaveReason) {
        this.id = id;
        this.empno = empno;
        this.leaveid = leaveid;
        this.leaveStartDate = leaveStartDate;
        this.leaveEndDate = leaveEndDate;
        this.noOfDays = noOfDays;
        this.leaveReason = leaveReason;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id='" + id + '\'' +
                ", empno=" + empno +
                ", leaveid=" + leaveid +
                ", leaveStartDate=" + leaveStartDate +
                ", leaveEndDate=" + leaveEndDate +
                ", noOfDays=" + noOfDays +
                ", leaveReason='" + leaveReason + '\'' +
                '}';
    }
}
