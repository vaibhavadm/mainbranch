package org.vaibhav.jaxrs.JAXRSMessenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.vaibhav.jaxrs.JAXRSMessenger.database.DummyDatabase;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Comment;
import org.vaibhav.jaxrs.JAXRSMessenger.model.ErrorMessage;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;

public class CommentService {
	public Map<Long, Message> messages = DummyDatabase.getMessages();

	public CommentService() {
	}

	public List<Comment> getAllComments(long messageId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}

	// The below code is modified to check the WebApplicationExceptions. In
	// order to
	// test this the @Provide annotation is commented out for
	// GenericExceptionMapper
	public Comment getSingleComment(long messageId, long commentId) {
		ErrorMessage errorMsg = new ErrorMessage("Not found", 404, "http://vaibhavjavaworld.com");
		Message message = messages.get(messageId);
		if (message == null) {
			// throw new WebApplicationException(Status.NOT_FOUND);
			Response response = Response.status(Status.NOT_FOUND).entity(errorMsg).build();
			throw new WebApplicationException(response);
		}
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		Comment comment = comments.get(commentId);
		if (comment == null) {
			Response response = Response.status(Status.NOT_FOUND).entity(errorMsg).build();
			throw new WebApplicationException(response);
			// there is one more way we can throw a fault message
			// throw new NotFoundException();
		}
		return comments.get(commentId);
	}

	public Comment addComment(long messageId, Comment newComment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		newComment.setId(comments.size() + 1);
		comments.put(newComment.getId(), newComment);
		return newComment;
	}

	public Comment updateComment(long messageId, Comment updatedComment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		if (updatedComment.getId() <= 0) {
			return null;
		}
		comments.put(updatedComment.getId(), updatedComment);
		return updatedComment;
	}

	public Comment removeComment(long messageId, long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
}
