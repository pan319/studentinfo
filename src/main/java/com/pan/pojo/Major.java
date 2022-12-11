package com.pan.pojo;

public class Major {
    private Integer id;
    private Integer majorCode;
    private Integer collegeCode;
    private String majorName;

    public Major() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(Integer majorCode) {
        this.majorCode = majorCode;
    }

    public Integer getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(Integer collegeCode) {
        this.collegeCode = collegeCode;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", majorCode=" + majorCode +
                ", collegeCode=" + collegeCode +
                ", majorName='" + majorName + '\'' +
                '}';
    }
}
