package com.zmax.quartz;

import com.zmax.quartz.cache.CacheHazelcast;
import com.zmax.quartz.dto.StrDTO;
import com.zmax.quartz.listeners.TopicListener;

/**
 * Created by zmax.
 */
public class TopicExample {

    public static void main(String[] args) {
        CacheHazelcast.TOPIC.addMessageListener(new TopicListener());

        StrDTO dto = new StrDTO();
        dto.setName("Test Name");
        dto.setId(1);
        CacheHazelcast.TOPIC.publish(dto);
    }
}
