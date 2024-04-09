package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Comment;
import pe.edu.upc.qalikay.repositories.ICommentRepository;
import pe.edu.upc.qalikay.servicesinterfaces.ICommentService;

import java.util.List;
@Service
public class CommentServiceImplement implements ICommentService {
    @Autowired
    private ICommentRepository sR;
    @Override
    public void insert(Comment comment) {
        sR.save(comment);
    }

    @Override
    public List<Comment> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public Comment listId(int id) {
        return sR.findById(id).orElse(new Comment());
    }
}
