package myFirstProject;

public class Main {

	public static void main(String[] args) {
		Course course1= new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Kamp�m�z �cretsizidir ve 2 ay s�recektir.","Engin Demirog");
		Course course2= new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Kamp�m�z �cretsizidir ve 2 ay s�recektir.","Engin Demirog");
		

		Course[] courses = {course1, course2};
		
		for(Course course : courses ) {
			
			System.out.println(course.name);
		}
		
		System.out.println(courses.length);
		
		
		CourseManager courseManager= new CourseManager();
		
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		
		
	}

}
