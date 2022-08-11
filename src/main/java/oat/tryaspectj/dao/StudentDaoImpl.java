package oat.tryaspectj.dao.using_jpa;

import oat.tryaspectj.dao.StudentDao;
import oat.tryaspectj.entity.Student;
import oat.tryaspectj.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findByStudentId(id);
    }

    @Override
    public Student getStudentByStudentName(String firstname, String lastname) {
        return studentRepository.findByFirstnameAndLastname(firstname,lastname);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
