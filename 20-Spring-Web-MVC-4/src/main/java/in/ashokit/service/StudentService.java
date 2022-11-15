package in.ashokit.service;




import java.util.Optional;

import in.ashokit.entity.Student;



public interface StudentService {

	public Iterable<Student> findAll();
	
	Optional<Student> findById(Integer id);
	
	
}
