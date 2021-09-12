package models;

public class Model_h {
	 private String business_ad,business_no,user_type,email;


	public Model_h() {
		// TODO Auto-generated constructor stub
	  	}


		public Model_h(String business_ad, String business_no, String user_type,String email) {
			super();
			this.business_ad = business_ad;
	        this.business_no = business_no;
	        this.user_type = user_type;
	        this.email = email;
	    }

	    public String getBusiness_ad() {
	        return business_ad;
	    }


	    public String getBusiness_no() {
	        return business_no;
	    }


	    public String getUser_type() {
	        return user_type;
	    }


		public String getEmail() {
			return email;
		}


		

}
