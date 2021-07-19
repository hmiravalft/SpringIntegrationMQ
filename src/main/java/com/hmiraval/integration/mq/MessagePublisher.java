package com.hmiraval.integration.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

public class MessagePublisher {
	
	@Autowired
    private MessageChannel senderChannel;
	
	public void processMessage(String message) {
        System.out.println("MessagePublisher::::::Sent message: " + message);

        senderChannel.send(MessageBuilder.withPayload(message).build());
    }

}
