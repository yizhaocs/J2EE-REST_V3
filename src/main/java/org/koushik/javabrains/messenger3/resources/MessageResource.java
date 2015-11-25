package org.koushik.javabrains.messenger3.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger3.model.Message;
import org.koushik.javabrains.messenger3.service.MessageService;

/**
 * http://localhost:8080/messenger3/webapi/messages
 */
@Path("/messages")
public class MessageResource {	
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getHelloWorld(){
//		return "Hello World!";
//	}
}
