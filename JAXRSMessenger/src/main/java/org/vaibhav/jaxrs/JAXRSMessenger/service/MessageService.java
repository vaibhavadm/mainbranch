package org.vaibhav.jaxrs.JAXRSMessenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.vaibhav.jaxrs.JAXRSMessenger.database.DummyDatabase;
import org.vaibhav.jaxrs.JAXRSMessenger.exception.DataNotFoundException;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;

public class MessageService {

	public Map<Long, Message> messages = DummyDatabase.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Hello World!", "Vaibhav"));
		messages.put(2L, new Message(2, "Hello Jersey!", "Vaibhav"));
		messages.put(3L, new Message(3, "Hello JAX-RS!", "Vaibhav"));
	}

	public List<Message> getallMessages() {
		return new ArrayList<Message>(messages.values());
	}

	// Query Parameter-Filtering example
	public List<Message> getallMessagesForYear(int year) {
		List<Message> messageForYear = new ArrayList<Message>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messageForYear.add(message);
			}
		}
		return messageForYear;
	}

	// Query Parameter - Pagination example
	public List<Message> getAllMessagesPaginated(int start, int size) {
		List<Message> list = new ArrayList<Message>(messages.values());
		if (start + size > list.size())
			return new ArrayList<Message>();
		return list.subList(start, start + size);
	}
	
	//adding code to support exception/fault 
	public Message getMessage(long id) {
		Message message  = messages.get(id);
		if(message == null){
			throw new DataNotFoundException("Resource you are looking is not available");
		}else
		return message;
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		message.setCreated(new Date());
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
