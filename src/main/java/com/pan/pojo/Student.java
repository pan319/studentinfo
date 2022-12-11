package com.pan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int Id;
    private String sno;
    private String name;
    private String cardId;
    private String sex;
    private int age;
    private String profession;
    private int classId;
    private int collegeId;
    private String password;
}
