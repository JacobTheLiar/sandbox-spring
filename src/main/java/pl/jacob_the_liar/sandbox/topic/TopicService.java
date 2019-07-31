package pl.jacob_the_liar.sandbox.topic;

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

    private List<Topic> topicList = new ArrayList<>(
            Arrays.asList(
                new Topic(1, "W", "ul. Składowa 5"),
                new Topic(2, "WWI", "ul. Składowa 8"),
                new Topic(3, "WSE", "ul. Składowa 5b"),
                new Topic(4, "WWP", "ul. Składowa 4")
            )
    );


    public List<Topic> getAllTopics() {
        return topicList;
    }


    public Topic getTopic(int topicId) {
        return topicList.stream()
                .filter(topic -> topic.getId() == topicId)
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(int topicId, Topic topic) {
        for (int i=0; i<topicList.size(); i++){
            Topic t = topicList.get(i);
            if (t.getId() == topic.getId()){
                topicList.set(i, topic);
                return;
            }
        }

    }

    public void deleteTopic(int topicId) {
        topicList.removeIf(topic -> topic.getId() == topicId);
    }
}
