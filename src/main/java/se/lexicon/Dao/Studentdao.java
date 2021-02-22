package se.lexicon.Dao;

import se.lexicon.model.Student;

import java.util.Optional;

public interface Studentdao {
    Student save( Student student);

    Optional<Student> findById(int id);
    boolean delete(Integer id);
}
