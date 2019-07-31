package pl.jacob_the_liar.sandbox.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 31.07.2019 09:56
 * *
 * @className: TopicService
 * *
 * *
 ******************************************************/

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }


    public Topic getTopic(int topicId) {
        return topicRepository.findById(topicId).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(int topicId, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int topicId) {
        topicRepository.deleteById(topicId);
    }
}
