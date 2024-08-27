/*
 * @(#) TestCourse.java    1.0     27/08/2024
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

public class TestCourse {
    public static void main(String[] args) throws Exception {
        CourseList list = new CourseList();

        initData(list);
        System.out.println(list.getListcourse());

        Course course_CanXoa = list.searchCourseByid("A123");
        list.removeCourse(course_CanXoa);

        System.out.println("Danh sach con lai sau khi xoa khoa hoc A123: \n"+ list.getListcourse());
    }

    public static void initData(CourseList list) throws Exception {

        list.addCourse(new Course("Math", "A123", "Toan cao cap", 3));
        list.addCourse(new Course("Physics", "A111", "Vat ly dai cuong", 4));
        list.addCourse(new Course("Chemistry", "A222", "Hoa ly thuyet", 3));
        list.addCourse(new Course("Biology", "A333", "He sinh thai", 3));
        list.addCourse(new Course("Computer Science", "A678", "OOP", 4));

    }
}
