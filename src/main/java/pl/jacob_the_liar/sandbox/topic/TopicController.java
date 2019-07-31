package pl.jacob_the_liar.sandbox.topic;

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
public class TopicController {


    // automatyczne połączenie z klasą TopicService z annotacją @Service
    @Autowired
    private TopicService topicService;

    // domyśłan metoda żądania to GET inaczej @RequestMapping(method = RequestMethod.GET, value = "/topics")
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicId}") // {topicId} - nazwa parametru przekazywanego w adresie
    //public Topic getTopic(@PathVariable("topicId") int topicId){ // @PathVariable("nazwa parametru") - wskazanie parametru przekazywanego z adresu z inna nazwą z metody
    public Topic getTopic(@PathVariable int topicId){ // @PathVariable - wskazanie parametru przekazywanego z adresu
        return topicService.getTopic(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics") //zmiana sposobu odebrania żądania na POST
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}") //zmiana sposobu odebrania żądania na POST
    public void updateTopic(@RequestBody Topic topic, @PathVariable int topicId){
        topicService.updateTopic(topicId, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}") //zmiana sposobu odebrania żądania na POST
    public void deleteTopic(@PathVariable int topicId){
        topicService.deleteTopic(topicId);
    }

}
