package pl.jacob_the_liar.sandbox.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:56
 * *
 * @className: CourseService
 * *
 * *
 ******************************************************/

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCoursesByTopicId(int topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }


    public Course getCourse(int courseId) {
        return courseRepository.findById(courseId).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(int courseId, Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(int courseId) {
        courseRepository.deleteById(courseId);
    }
}
