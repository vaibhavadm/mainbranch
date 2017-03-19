package org.vaibhav.jaxrs.JAXRSMessenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vaibhav.jaxrs.JAXRSMessenger.database.DummyDatabase;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Comment;
import org.vaibhav.jaxrs.JAXRSMessenger.model.Message;

public class CommentService {
	public Map<Long, Message> messages = DummyDatabase.getMessages();
	
	public CommentService(){
	}
	
	public List<Comment> getAllComments(long messageId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}

	public Comment getSingleComment(long messageId, long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
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
