/*
 * @(#) CourseList.java    1.0     27/08/2024
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CourseList {

    private int count;
    private ArrayList<Course> courses;

    public CourseList(){
        courses = new ArrayList<Course>();
    }

    public boolean addCourse(Course c) throws Exception {
        if (!courses.contains(c)){
            courses.add(c);
            return true;
        }
        return false;
    }
//    public boolean exists(Course course) {
//
//    }

    public ArrayList<Course> getListcourse() {
        return courses;
    }
    public boolean removeCourse(Course c) {
        if (courses.contains(c)){
            courses.remove(c);
            return true;
        }
        return false;
    }
    public Course searchCourseByid(String id) {
        for (Course c : courses) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }
    public Course searchCourseByTitle(String title) {
        for (Course c : courses) {
            if (c.getTitle().equalsIgnoreCase(title)) {
                return c;
            }
        }
        return null;
    }
    public Course searchCourseByDepartment(String department) {
        for (Course c : courses) {
            if (c.getDepartment().equalsIgnoreCase(department)) {
                return c;
            }
        }
        return null;
    }
    public void shortofTitle() {
        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                // TODO Auto-generated method stub
                String tenKhoaHoc1 = (String) c1.getTitle();
                String tenKhoaHoc2 = (String) c2.getTitle();
                return tenKhoaHoc1.compareTo(tenKhoaHoc2);
            }
        });
    }

    public ArrayList<Course> findMaxCreditCourse() {
        ArrayList<Course> result = new ArrayList<Course>();
        int maxCredits = 0;

        // Tìm số tín chỉ lớn nhất
        for (Course course : courses) {
            if (course.getCredit() > maxCredits) {
                maxCredits = course.getCredit();
            }
        }

        // Tìm các khóa học có số tín chỉ lớn nhất
        for (Course course : courses) {
            if (course.getCredit() == maxCredits) {
                result.add(course);
            }
        }
        return result;
    }


}