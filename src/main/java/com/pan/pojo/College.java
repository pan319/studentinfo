package com.pan.pojo;

public class College {
    private Integer id;
    private Integer collegeCode;
    private String collegeName;

    public College() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(Integer collegeCode) {
        this.collegeCode = collegeCode;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Colleger{" +
                "id=" + id +
                ", collegeCode=" + collegeCode +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
