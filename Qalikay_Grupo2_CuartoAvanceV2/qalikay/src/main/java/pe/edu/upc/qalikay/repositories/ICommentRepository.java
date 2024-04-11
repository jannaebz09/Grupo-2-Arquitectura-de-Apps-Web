package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Comment;

import java.util.List;

@Repository
public interface ICommentRepository extends JpaRepository<Comment,Integer> {
    @Query(value = "Select u.full_name as Usuario, avg(qualification) as Calificacion \n" +
            "from comment c inner join usert u \n" +
            "on c.id_user = u.id_user  \n" +
            "group by u.full_name ",nativeQuery = true)
    public List<String[]> averageByUser();
}
