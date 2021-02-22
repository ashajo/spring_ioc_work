package se.lexicon.Dao;

import se.lexicon.model.Student;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentImpl  implements Studentdao{

    private Set<Student> students = new HashSet<>();

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Optional<Student> findById(int id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
