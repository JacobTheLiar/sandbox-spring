package pl.jacob_the_liar.sandbox.course;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 13:02
 * *
 * @className: TopicRepository
 * *
 * *
 ******************************************************/

public interface CourseRepository extends CrudRepository<Course, Integer>{
    
    
    // jak chcemy szukać po jakimś parametrze to wystarczy, że zeklarujemy
    // metode findBy[nazwa pola] tak jak tutaj findByName
    List<Course> findByName(String name);
    
    // używająć CamelCase przechodzimy do kolejnych pól dalej
    // np findByTopicId czuli z klasy Topic jego Id
    List<Course> findByTopicId(int topicId);
    
}
