package pl.jacob_the_liar.sandbox.topic;


import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:29
 * *
 * @className: Topic
 * *
 * *
 ******************************************************/
@Entity  // informujemy silnik że tabela nazywa się jak ta klasa
public class Topic{
    
    @Id // inforujemy silnik ze w tej tabeli /topic/ będzie kolumna z ID
    private Integer id;
    private String name;
    private String description;
    
    
    public Topic(){
        this(-1, "", "");
    }
    
    
    public Topic(Integer id){
        this(id, "", "");
    }
    
    
    public Topic(int id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
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
}
