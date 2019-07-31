package pl.jacob_the_liar.sandbox.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:21
 * *
 * @className: TopicController
 * *
 * *
 ******************************************************/
@RestController
public class CourseController {


    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable int topicId){

        return courseService.getAllCourses();
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable int topicId, @PathVariable int courseId){
        return courseService.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/courseId") //zmiana sposobu odebrania żądania na POST
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{courseId}") //zmiana sposobu odebrania żądania na POST
    public void updateTopic(@RequestBody Course course, @PathVariable int courseId){
        courseService.updateCourse(courseId, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{courseId}") //zmiana sposobu odebrania żądania na POST
    public void deleteTopic(@PathVariable int courseId){
        courseService.deleteCourse(courseId);
    }

}
