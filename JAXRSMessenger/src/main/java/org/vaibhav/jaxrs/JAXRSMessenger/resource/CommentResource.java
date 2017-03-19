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
import javax.ws.rs.core.MediaType;

import org.vaibhav.jaxrs.JAXRSMessenger.model.Comment;
import org.vaibhav.jaxrs.JAXRSMessenger.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	CommentService cmtService = new CommentService();

	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageId) {
		return cmtService.getAllComments(messageId);
	}

	@GET
	@Path("/{commentId}")
	public Comment getComments(@PathParam("commentId") long commentId, @PathParam("messageId") long messageId) {
		return cmtService.getSingleComment(messageId, commentId);
	}

	@POST
	public Comment createComment(@PathParam("messageId") long messageId, Comment newComment) {
		return cmtService.addComment(messageId, newComment);
	}

	@PUT
	@Path("/{commentId}")
	public Comment udpateComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId,
			Comment updatedComment) {
		updatedComment.setId(commentId);
		return cmtService.updateComment(messageId, updatedComment);
	}

	@DELETE
	@Path("/{commentId}")
	public Comment deleteComment(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
		return cmtService.removeComment(messageId, commentId);
	}

}
