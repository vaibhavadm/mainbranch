package org.vaibhav.jaxrs.JAXRSMessenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;
import org.vaibhav.jaxrs.JAXRSMessenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService msgService = new MessageService();

	// To have JSON support check jersey-media-moxy is added in pom.xml
	// to add filteration and pagination we have to use QueryParams
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessage(@QueryParam("year") int yearFromURL,
									   @QueryParam("start") int startFromURL,
									   @QueryParam("size") int sizeFromURL) {
		if(yearFromURL>0){
			return msgService.getallMessagesForYear(yearFromURL);
		}
		
		if(startFromURL>0 && sizeFromURL>0){
			return msgService.getAllMessagesPaginated(startFromURL, sizeFromURL);
		}
		return msgService.getallMessages();
	}

	// the id in path parameter and pathparam parameter should be the same
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getSingleMessage(@PathParam("messageId") long messageID) {
		return msgService.getMessage(messageID);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message jsonMessage) {
		return msgService.addMessage(jsonMessage);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam("messageId") long id) {
		return msgService.removeMessage(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message jsonMessage) {
		return msgService.updateMessage(jsonMessage);
	}
	
	//this is how we do sub-resourcing in jax-rs
	@Path("/{messageId}/comments")
	public CommentResource getComments(@PathParam("messageId") int id){
		return new CommentResource();
	}
	
}
