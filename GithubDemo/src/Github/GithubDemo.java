package Github;

public class GithubDemo {
	
	String user="rutujab011@gmail.com";
	String pass="Ishu@2315";
	void login() {
		if(user.equals("rutujab011@gmail.com") && pass.equals("Ishu@2315")) {
			System.out.println("login sussfully");
		}
	}
	
	public static void main(String[] args) {
		GithubDemo g=new GithubDemo();
		g.login();
	}

}
