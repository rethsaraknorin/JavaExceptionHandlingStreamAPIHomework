package service;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public interface CourseService {
    void addNewCourse();
    void listAllCourses();
    void findCourseById();
    void findCourseByTitle();
    void removeCourseById();
    final List<Course> courses = new ArrayList<>();
    void loadCoursesFromFile();
    void writeAllCoursesToFile();
}
