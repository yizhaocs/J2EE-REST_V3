package org.koushik.javabrains.messenger3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger3.database.DatabaseClass;
import org.koushik.javabrains.messenger3.model.Message;

public class MessageService {
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World!", "Koushik");
		Message m2 = new Message(1L, "Hello Jersey!", "Koushik");

		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);

		return list;
	}
}
