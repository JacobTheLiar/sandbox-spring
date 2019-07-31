package pl.jacob_the_liar.sandbox.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jacob_the_liar.sandbox.topic.Topic;

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
public class CourseController{
    
    @Autowired
    private CourseService courseService;
    
    
    @RequestMapping("/topics/{topicId}/courses")  //domyślnie GET
    public List<Course> getAllCourses(@PathVariable int topicId){
        //TODO przyjdzie czas na to
        return courseService.getCoursesByTopicId(topicId);
    }
    
    
    @RequestMapping("/topics/{topicId}/courses/{courseId}") // domyślnie GET
    public Course getCourse(@PathVariable int topicId, @PathVariable int courseId){
        return courseService.getCourse(courseId);
    }
    
    
    @RequestMapping(method = RequestMethod.POST, //zmiana sposobu odebrania żądania na POST
            value = "/topics/{topicId}/courses/")
    public void addCourse(@RequestBody Course course, @PathVariable int topicId){
        course.setTopic(new Topic(topicId));
        courseService.addCourse(course);
    }
    
    
    @RequestMapping(method = RequestMethod.PUT, //zmiana sposobu odebrania żądania na POST
            value = "/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Course course, @PathVariable int topicId, @PathVariable int courseId){
        course.setTopic(new Topic(topicId));
        courseService.updateCourse(courseId, course);
    }
    
    
    @RequestMapping(method = RequestMethod.DELETE, //zmiana sposobu odebrania żądania na POST
            value = "/topics/{topicId}/courses/{courseId}")
    public void deleteCourse(@PathVariable int courseId){
        courseService.deleteCourse(courseId);
    }
}
