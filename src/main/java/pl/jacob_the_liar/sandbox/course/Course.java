package pl.jacob_the_liar.sandbox.course;


import pl.jacob_the_liar.sandbox.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:29
 * *
 * @className: Topic
 * *
 * *
 ******************************************************/
@Entity  // informujemy silnik że tabela nazywa się jak ta klasa
public class Course{
    
    @Id // inforujemy silnik ze w tej tabeli /topic/ będzie kolumna z ID
    private Integer id;
    private String name;
    private String description;
    
    @ManyToOne // informujemy silnik o relacji klasy Course do klasy Topic
               // jeden topic może mieć wiele kursów
    private Topic topic;
    
    
    public void setId(Integer id){
        this.id = id;
    }
    
    
    public Course(){
    }
    
    
    public Course(int id, String name, String description, int topicId){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId);
    }
    
    
    public int getId(){
        return id;
    }
    
    
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getName(){
        return name;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public String getDescription(){
        return description;
    }
    
    
    public void setDescription(String description){
        this.description = description;
    }
    
    
    public Topic getTopic(){
        return topic;
    }
    
    
    public void setTopic(Topic topic){
        this.topic = topic;
    }
}
