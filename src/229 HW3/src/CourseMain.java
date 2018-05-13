public class CourseMain {
	public static void main(String[] args) {
		Course c1 = new Course("Data Structures");
		Course c2 = new Course("Database Systems");

		c1.addStudent("Peter Jones");
		c1.addStudent("Kim Smith");
		c1.addStudent("Anne kennedy");

		c2.addStudent("Peter Jones");
		c2.addStudent("Steve Smith");

		System.out.println("Number of students in course1: "
			+ c1.getNumberOfStudents());
		String[] students = c1.getStudents();
		for (int i = 0; i < c1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ c2.getNumberOfStudents());
	}
}