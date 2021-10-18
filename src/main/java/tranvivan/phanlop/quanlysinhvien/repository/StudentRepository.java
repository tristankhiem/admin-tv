package tranvivan.phanlop.quanlysinhvien.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tranvivan.phanlop.quanlysinhvien.model.Student;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    <T> List<T> findAllBy(Class<T> type);

    Optional<List<Student>> findAllBy();
}
