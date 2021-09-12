package models;

public class Model_f {

	 String email,pass;

	    public  Model_f(){

	    }

	    public Model_f(String email, String pass) {
	        this.email = email;
	        this.pass = pass;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPass() {
	        return pass;
	    }

	    public void setPass(String pass) {
	        this.pass = pass;
	    }
}
