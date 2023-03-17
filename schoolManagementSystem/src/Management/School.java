package Management;

import java.util.List;

public class School {
	private static List<Teacher> teachers;
	private static List<Student> students;
	

	public School(List<Teacher> teachers, List<Student> students) {

	}

	public static List<Teacher> getTeachears() {
		return teachers;
	}

	public static List<Student> getStudents() {
		return students;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);

	}

	public void addStudent(Student student) {
		students.add(student);
	}


}