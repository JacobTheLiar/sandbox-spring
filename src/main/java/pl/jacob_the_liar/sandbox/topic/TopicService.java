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

//    private List<Topic> topicList = new ArrayList<>(
//            Arrays.asList(
//                new Topic(1, "W", "ul. Składowa 5"),
//                new Topic(2, "WWI", "ul. Składowa 8"),
//                new Topic(3, "WSE", "ul. Składowa 5b"),
//                new Topic(4, "WWP", "ul. Składowa 4")
//            )
//    );


    public List<Topic> getAllTopics() {
        // -- wersja z listą --
        //return topicList;

        // -- wersja z bazą danych --
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }


    public Topic getTopic(int topicId) {
        // -- wersja z listą --
//        return topicList.stream()
//                .filter(topic -> topic.getId() == topicId)
//                .findFirst()
//                .get();
        // -- wersja  z bazą danych --
        return topicRepository.findById(topicId).get();
    }

    public void addTopic(Topic topic) {
        // -- wersja z listą ---
        //topicList.add(topic);

        // -- wersja z bazą danych --
        topicRepository.save(topic);
    }

    public void updateTopic(int topicId, Topic topic) {
        // -- wersja z listą --
//        for (int i=0; i<topicList.size(); i++){
//            Topic t = topicList.get(i);
//            if (t.getId() == topic.getId()){
//                topicList.set(i, topic);
//                return;
//            }
//        }
        // -- wersja z bazą --
        topicRepository.save(topic);
    }

    public void deleteTopic(int topicId) {
        // -- wersja z listą ---
        //topicList.removeIf(topic -> topic.getId() == topicId);

        // -- wersja z bazą danych --
        topicRepository.deleteById(topicId);
    }
}
