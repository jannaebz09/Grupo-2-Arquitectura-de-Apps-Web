package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Comment;

import java.util.List;

public interface ICommentService {
    public void insert(Comment comment);
    public List<Comment> list();

    public void delete(int id);
    public Comment listId(int id);
}
