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
    private ICommentRepository cR;
    @Override
    public void insert(Comment comment) {
        cR.save(comment);
    }

    @Override
    public List<Comment> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Comment listId(int id) {
        return cR.findById(id).orElse(new Comment());
    }

    @Override
    public List<String[]> averageByUser() {
        return cR.averageByUser();
    }

    @Override
    public List<Comment> listacalfmayor3() {
        return cR.listacalfmayor3();
    }

}
