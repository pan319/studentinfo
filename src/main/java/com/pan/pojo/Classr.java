package com.pan.pojo;

public class Classr {
    private Integer id;
    private Integer classCode;
    private String className;
    private Integer majorCode;

    public Classr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCde(Integer classCde) {
        this.classCode = classCde;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(Integer majorCode) {
        this.majorCode = majorCode;
    }

    @Override
    public String toString() {
        return "Classr{" +
                "id=" + id +
                ", classCode=" + classCode +
                ", className='" + className + '\'' +
                ", majorCode=" + majorCode +
                '}';
    }
}
