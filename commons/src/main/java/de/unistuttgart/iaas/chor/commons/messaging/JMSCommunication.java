package de.unistuttgart.iaas.chor.commons.messaging;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JMSCommunication {

	
	public static boolean getSync(String messageID){
		
		
		
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		Connection connection = null;
		try {
			connection = connectionFactory.createConnection();
			connection.start();
//			Session session = connection.createSession(true, -1);
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			Destination queue = session.createQueue("de.unistuttgart.chor.service.sync");
			MessageConsumer consumer = session.createConsumer(queue, "JMSCorrelationID='"+messageID+"'");
			//MessageConsumer consumer = session.createConsumer(queue);
			Message message = consumer.receive(100000);
			//session.commit();
		
			if(message != null){
				return true;
			}
			
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(connection != null){
				try {
					connection.stop();
					connection.close();
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		return false;
	}
	
}
