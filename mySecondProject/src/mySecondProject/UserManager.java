package mySecondProject;

public class UserManager {

	 public void addUser(User user) {
		 System.out.println("Kullan�c� siteme eklendi: "+ user.getName());
	 }
	 
	 public void getEmail(User user) {
		 System.out.println(user.getName()+ " isimli kullan�c�n�n eMaili: "+ user.geteMail());
	 }
	 
	 public void numberOfCourses(User user) {
		 System.out.println("Kullan�c�n�n kurs say�s�: "+ user.getNumberOfCourses());
	}
}
