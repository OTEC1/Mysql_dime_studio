package com.dime_io;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dime_io.in.Glazer;
import com.dime_io.in.Owners_Post;
import com.dime_io.in.Products;
import com.dime_io.in.Send_off;

import models.Model_a;
import models.Model_b;
import models.Model_c;
import models.Model_e;
import models.Model_f;
import models.Model_g;
import models.Model_h;
import models.Model_i;




@RestController
@RequestMapping("/qmWivT")
@CrossOrigin("*")
public class Home_down  {

	
	@Autowired
	Send_off send_off;
	
	
	@GetMapping(path="/view1")
	public ResponseEntity<Model_a> get_list_of_fabrics_owner_spcefic(@RequestParam(value = "fabric_owner", 
	defaultValue = "Ekene")  String fabric_owner,@RequestParam(value = "limit", defaultValue = "50") 
	   String limit, Model_a api){
		//if(match)
	        Model_a respones=send_off.Pull_indiviual(fabric_owner, limit, api);
		return new ResponseEntity <Model_a>(respones,HttpStatus.OK);
	}
		
	
	
	
	@GetMapping(path="/view2")
	public ResponseEntity<Model_a> get_list_of_fabrics_category_spcific(
			@RequestParam(value = "fabric_category", defaultValue = "top") String fabric_category,
			@RequestParam(value = "limit", defaultValue = "50") String limit, 
            @RequestParam(value= "id",defaultValue = "1") String id, Model_a api){
		
		//if(match)
	        Model_a respones=send_off.Pull_lastes(fabric_category, limit, api);
		return new ResponseEntity <Model_a>(respones,HttpStatus.OK);
	}
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "/view3")
	public ResponseEntity<Model_a> list_records() {
		   List<Model_a> listEmp = send_off.clientList();
		return  new ResponseEntity(listEmp,HttpStatus.OK);
	}
	

	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(path="/view4")
	public ResponseEntity<Model_c> auth_request(){
		//if(match)
	        List<Model_c> respones=send_off.auth_member_request();
		return new ResponseEntity (respones,HttpStatus.OK);
	}
	
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(path="/view5")
	public ResponseEntity<Products> get_list_of_category_post_request( @RequestParam(value = "user_table") String user_table){
		//if(match)
			//System.out.println(user_table +"  Query String 1");
	        List<Products> respones=send_off.pull_from_user_catergory_list(user_table);
		return new ResponseEntity (respones,HttpStatus.OK);
	}
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(path="/view6")
	public ResponseEntity<Owners_Post> get_post_contact( @RequestParam(value = "user_email") String user_email){
		//if(match)
			//System.out.println(user_email +"  Query String 2");
	        List<Owners_Post> respones=send_off.send_back(user_email);
		return new ResponseEntity (respones,HttpStatus.OK);
	}
	
	
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(path="/view7")
	public ResponseEntity<Model_i> get_auto_table_created(@RequestParam(value = "user_email") String user_email){
				//System.out.println(user_email +"  Query String 3");
				Model_i respones=send_off.table_create(user_email);
		return new ResponseEntity (respones,HttpStatus.OK);
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(path = "phase1")
	public ResponseEntity<Model_g> creae_user_shop_post(@RequestBody Model_b modes){
		Model_g res =send_off.create_post(modes);
		return new ResponseEntity(res,HttpStatus.OK);
	}
	
	
	
	@PostMapping(path = "phase2")
	public ResponseEntity<Products> create_api_values(@RequestBody Products modes ){
		Products respones=send_off.ad_on_to_user_catergory_list(modes);
		return new ResponseEntity<Products>(respones,HttpStatus.OK);
	}
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(path = "phase3")
	public ResponseEntity<Model_g> create_api_member(@RequestBody Model_e modes){
		Model_g respones=send_off.Register_member(modes);
		return new ResponseEntity(respones,HttpStatus.OK);
	}
	
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(path="/phase4")
	public ResponseEntity<Model_g> auth_member_login(@RequestBody Model_f ms){
	        Model_g respones=send_off.auth_member(ms);
		return new ResponseEntity (respones,HttpStatus.OK);
	}
	 
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(path = "phase5")
	public ResponseEntity<Model_h> create_business_details(@RequestBody Model_h modes){
		Model_g respones=send_off.Busniess_detailing(modes);
		return new ResponseEntity(respones,HttpStatus.OK);
	}
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(path = "phase6")
	public ResponseEntity<Model_i> update_user_img(@RequestParam(value = "img_url") String img_url, @RequestParam(value = "user_email") String user_email){
		System.out.println(user_email+"  "+ img_url);
		Model_i respones=send_off.update_user_profile_pic(img_url, user_email);
		return new ResponseEntity(respones,HttpStatus.OK);
	}
	
	
	


}
