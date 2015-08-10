package com.zmax.quartz.listeners;

import com.hazelcast.core.Message;
import com.hazelcast.core.MessageListener;
import com.zmax.quartz.dto.StrDTO;
import org.apache.log4j.Logger;

/**
 * Created by mzavgorodny
 */
public class TopicListener implements MessageListener<StrDTO> {

    private Logger log = Logger.getLogger(SimpleListener.class);

    public void onMessage(Message<StrDTO> message) {
        StrDTO myEvent = message.getMessageObject();
        log.debug( "Message received, id ==  " + myEvent.getId()+ ", name == " + myEvent.getName());
        //TODO: put it into HUZELCAST
    }
}
