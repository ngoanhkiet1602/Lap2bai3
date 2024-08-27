/*
 * @(#) Course.java    1.0     27/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;


/*
 * @description:
 * @author: Ngo Anh Kiet
 * @date:   27/08/2024
 * @version:    1.0
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {
    private String department;
    private String id;
    private String title;
    private int credit;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        String regex = "^[a-zA-Z0-9]{3,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);

        if (matcher.matches())
            this.id = id;
        else
            throw new Exception("ID must have at least 3 characters\n" +
                    "ID must contain only letters or digits\n");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (!title.equals(""))
            this.title = title;
        else
            throw new Exception("titile must not be empty");
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) throws Exception {
        if (credit > 0)
            this.credit = credit;
        else
            throw new Exception("Credit must be greater than 0");
    }

    public Course() {
    }

    public Course(String department, String id, String title, int credit) {
        this.department = department;
        this.id = id;
        this.title = title;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "department='" + department + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", credit=" + credit +
                '}';
    }
}
