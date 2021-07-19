package com.hmiraval.integration.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.integration.config.EnableIntegration;
@EnableIntegration
public class MessageListener {
	
	public void processMessage(Message message) {

        if (message instanceof TextMessage) {
            TextMessage txtmsg = (TextMessage) message;

            try {

                System.out.println("MessageListener::::::Received message: "
                        + txtmsg.getText());
            } catch (JMSException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

 }

}