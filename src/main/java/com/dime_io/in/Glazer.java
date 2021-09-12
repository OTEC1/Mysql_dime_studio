package com.dime_io.in;

import java.util.List;import org.apache.logging.log4j.util.StringBuilderFormattable;

import models.Model_a;
import models.Model_b;
import models.Model_c;
import models.Model_e;
import models.Model_f;
import models.Model_g;
import models.Model_h;
import models.Model_i;

public interface Glazer {
	
	
	
	Model_a Pull_lastes(String column, String size, Model_a mode);

	Model_g create_post(Model_b models);

	List<Model_a> clientList();
	
	List<Model_c>  auth_member_request();

	Model_a Pull_indiviual(String fabric_owner, String limit, Model_a app);
	
	Model_g  Register_member(Model_e  model);
	
	Model_g Busniess_detailing(Model_h  modes);
	
	Model_g auth_member(Model_f mo);
	
	Model_i table_create(String email);
	
	Products  ad_on_to_user_catergory_list(Products  products);

	List<Products>  pull_from_user_catergory_list(String user);
	
	List<Owners_Post>  send_back(String user_email);
	
	Model_i update_user_profile_pic(String img_url, String user_eamil);
	
  
	
	
	
	
	
	
	
	
	
	

}
