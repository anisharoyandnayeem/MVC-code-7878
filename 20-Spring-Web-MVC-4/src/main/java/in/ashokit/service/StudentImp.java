package in.ashokit.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repositories.StudentRepository;

@Transactional
@Service("studentService")
public class StudentImp implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Iterable<Student> findAll() {
		return studentRepo.findAll();
	}
	@Override
    public Optional<Student> findById(Integer id) {

        return studentRepo.findById(id);
    }

}
