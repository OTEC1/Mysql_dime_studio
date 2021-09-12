package com.dime_io.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.http.HttpRequest;
import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.dime_io.in.dick.Java_Con;
import com.dime_io.in.dick.de_hash;

import models.Model_a;
import models.Model_b;
import models.Model_c;
import models.Model_e;
import models.Model_f;
import models.Model_g;
import models.Model_h;
import models.Model_i;

@Service
public class Send_off   implements Glazer{

	
	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	DataSource  source;
	
	
	

	
	private int x=0; 
	private String p1,p2;

	@Override
	public Model_a Pull_lastes(String cats, String size, Model_a mode) {
			
		NamedParameterJdbcTemplate  template=new NamedParameterJdbcTemplate(source);
		SqlParameterSource param=new  MapSqlParameterSource("fabric_category",cats);
		template.query("Select * from user_post_db w where w.fabric_category = :fabric_category ", param, new  ResultSetExtractor<Model_a>() {
			
			@Override
			public Model_a extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					
					
					mode.setId(rs.getString(1));		
					mode.setFabric_name(rs.getString(2));
					mode.setFabric_category(rs.getString(3));
					mode.setFabric_in_stock(rs.getString(4));
					mode.setFabric_path(rs.getString(5));
					mode.setFabric_owner(rs.getString(6));
					mode.setFabric_address(rs.getString(7));
					mode.setFabric_price(rs.getString(8));
					
					  
					
				}return null;}});
		
		return mode;
	}

	
	

	@Override
	public Model_g  create_post(Model_b models) {
		Model_g t=null;
		Model_a mode= new Model_a();
		
		mode.setFabric_name(models.getFabric_name());
		mode.setFabric_category(models.getFabric_category());
		mode.setFabric_in_stock(models.getFabric_in_stock());
		mode.setFabric_path(models.getFabric_path());
		mode.setFabric_owner(models.getFabric_owner());
		mode.setFabric_address(models.getFabric_address());
		mode.setFabric_price(models.getFabric_price());
		mode.setTime_stamp(new Date().toString());
		
		
		int k=insert(mode.getFabric_name(), mode.getFabric_category(), mode.getFabric_in_stock(), 
				mode.getFabric_path(), mode.getFabric_owner(), mode.getFabric_address(), 
				mode.getFabric_price(), mode.getTime_stamp());
		
		if(k==1) {
			 t = new Model_g();
			t.setEmailR(true);
		}
			
		return t;
	}




	private int insert(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		 String sql = "INSERT INTO user_post_db  (fabric_name, fabric_category,fabric_in_stock,fabric_path,fabric_owner,fabric_address,fabric_price,time_stamp) VALUES (?,?,?,?,?,?,?,?)";
		 return  jdbc.update(sql, string,string2,string3,string4,string5,string6, string7, string8);
	        }
	
	




	@Override
	public List<Model_a> clientList() {
		
		List<Model_a> list=jdbc.query("Select * from user_post_db order by id desc", new RowMapper<Model_a>() {

			@Override
			public Model_a mapRow(ResultSet rs, int rowNum) throws SQLException {
				
			Model_a   model= new Model_a();
			
				model.setId(rs.getString(1));
				model.setFabric_name(rs.getString(2));
				model.setFabric_category(rs.getString(3));
				model.setFabric_in_stock(rs.getString(4));
				model.setFabric_path(rs.getString(5));
				model.setFabric_owner(rs.getString(6));
				model.setFabric_address(rs.getString(7));
				model.setFabric_price(rs.getString(8));
				model.setTime_stamp(rs.getString(9));
				return model;
			}
			
		});
		
		return list;
	}









	@Override
	public List<Model_c> auth_member_request() {
			   List<Model_c>   list = new ArrayList<>();
			   Model_c model=new Model_c();
				model.setId(de_hash.r0);
				model.setP1(de_hash.r1);
				model.setP2(de_hash.r2);
				model.setP3(de_hash.r3);
				list.add(model);
		return list;
	}
	

	
	
	
	
	
	
	
	

	



	@Override
	public Model_a Pull_indiviual(String fabric_owner, String limit, Model_a app) {
		NamedParameterJdbcTemplate  template=new NamedParameterJdbcTemplate(source);
		SqlParameterSource param=new  MapSqlParameterSource("fabric_owner",fabric_owner);
		template.query("Select * from user_post_db w where w.fabric_owner = :fabric_owner ", 
												param, new  ResultSetExtractor<Model_a>() {
			
			@Override
			public Model_a extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					
					
					app.setId(rs.getString(1));		
					app.setFabric_name(rs.getString(2));
					app.setFabric_category(rs.getString(3));
					app.setFabric_in_stock(rs.getString(4));
					app.setFabric_path(rs.getString(5));
					app.setFabric_owner(rs.getString(6));
					app.setFabric_address(rs.getString(7));
					app.setFabric_price(rs.getString(8));
					
					  
					
				}return null;}});
		
		return app;
		
	}



	
	

	@Override
	public Model_g Register_member(Model_e model) {
		Model_g  t = null;
		String uk =String.valueOf(GEN());
		Model_e  mode_e=new Model_e();
		
		mode_e.setName(model.getName());
		mode_e.setEmail(model.getEmail());
		mode_e.setPass(model.getPass());
		mode_e.setMember_status(model.getMember_status());
		mode_e.setFlags(model.isFlags());
		mode_e.setPics_path(model.getPics_path());
		
	
		int x= inset_into_db(mode_e.getName(),mode_e.getEmail().toLowerCase(), mode_e.getPass(),
				mode_e.getMember_status(), mode_e.isFlags(), mode_e.getPics_path(),uk);
		
		if(x==1) {
			  t=new Model_g();
			  t.setEmailR(true);
		}
		
		
		return t;
	}




	private int inset_into_db(String name, String email, String pass, String mstatus,  boolean b, String pic, String mks) {
		
		return	jdbc.update("insert into  User_Reg (name,email,passwords, time_stamp,uuids, member_status,flag,pic_path) values(?,?,?,?,?,?,?,?)"
													,name,email,new Plan_to_hash().hashs(pass),new Date().toString(),mks,mstatus, b,pic);
	
	
	}




	private Object GEN() {
		return String.
				valueOf(System.
						nanoTime()).
				concat(String.
						valueOf(System
				.currentTimeMillis())).toString();
	}



	
	
	
	
	@Override
	public Model_g auth_member(Model_f mo) {
		
		String email=mo.getEmail();
		NamedParameterJdbcTemplate  template=new NamedParameterJdbcTemplate(source);
		SqlParameterSource param=new  MapSqlParameterSource("email",email);
		template.query("Select * from User_Reg w where w.email = :email ", param, new  ResultSetExtractor<Model_a>() {
			
			@Override
			public Model_a extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					x=1; 
					p1=rs.getString(4);
					p2=rs.getString(9);
				}
				return null;}});
			if(x==1) 
				if(new Plan_to_hash().checker(mo.getPass(), p1))
					x=2002;
				else
					x=4004;
			else 
				x=2;
			
			
			Model_g f=new Model_g();
			f.setEmailP(x);
			f.setImg(p2);
			
		return f;
	}


	



	@Override
	public Products ad_on_to_user_catergory_list(Products prods) {
		Products p3=null;
		Products  p2= new Products();
		p2.setCategory(prods.getCategory());
		p2.setUser(prods.getUser());
		
		int x= insert1(p2.getCategory(),p2.getUser());

			
		if(x==1) {
		    p3= new Products();
			p3.setUser("Saved");
		}
			
		return p3;
	}

	
	

	
	
	
	
	private int insert1(String cat, String tables) {	
		int n=0;
		 Connection  con= new Java_Con().get_pass();
		 try {
			PreparedStatement  ps = con.prepareStatement("INSERT INTO "+tables+" (r1) VALUES (?)");
			ps.setString(1, cat);
			ps.execute();
			n=1;
		 } catch (SQLException e) {
			System.out.println(e);
		}
	     return  n;
		}



	
	
	
	
	@Override
	public Model_i table_create(String us) {

       String d=USER_GEN(us);
       Model_i i = null;
       if(d!=null) {
		 //System.out.println(d +" 2! "+ us);
		 us=us.trim().replace(".", "".trim()).replace("@", "".trim()).trim().concat(d.trim()+"K").trim().toUpperCase();
		 //System.out.println(us +"  3! ");
		 Connection  con= new Java_Con().get_pass();
		  
		  try {
			   con.prepareStatement("create table if not exists "+us+"(id serial,r1 varchar(500))").execute();
				} catch (SQLException e) {
					System.out.println(e);
				} 
             }
       
       
       i = new Model_i();
		 i.setUser(us);
		 i.setSendK(de_hash.r4geo);
		 d=null;
 
		return i;
	}
	
	
	
	
	
	
	private String xp;
	private String USER_GEN(String email) {
		
		NamedParameterJdbcTemplate  template=new NamedParameterJdbcTemplate(source);
		SqlParameterSource param=new  MapSqlParameterSource("email",email);
		return template.query("Select uuids from User_Reg w where w.email = :email ", param, new  ResultSetExtractor<String>() {
			
			@Override
			public String extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					
					xp =rs.getString("uuids");
					
					return xp;
					}
				return null;
				}
			});
	
		
	
		}



	@Override
	public List<Products> pull_from_user_catergory_list( String table) {
		
		NamedParameterJdbcTemplate  template=new NamedParameterJdbcTemplate(new Java_Con().mysqlDataSource());
		List<Products> list=template.query("Select * from "+table+" order by id desc", new RowMapper<Products>() {

			@Override
			public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
				Products   model= new Products();
				model.setCategory(rs.getString(2));
				return model;
			}
			
		});
		
		return list;
	}




	@Override
	public Model_g Busniess_detailing(Model_h modes) {
		Model_g temp = null;
		Model_h hold = new Model_h(modes.getBusiness_ad(),modes.getBusiness_no(), modes.getUser_type(), modes.getEmail());
		int k=  complete_insert(hold.getBusiness_ad(),modes.getBusiness_no(), hold.getUser_type(), hold.getEmail());
		if(k==1) {
		    temp = new Model_g();
			temp.setEmailR(true);
		}
			
		return temp;
	}




	private int   complete_insert(String business_ad, String business_no, String user_type, String email) {
		return jdbc.update("insert into Busniess_details(busniess_phone,busniess_ad,member_type,email) values (?,?,?,?)",
									business_no,business_ad,user_type, email);
		
	}




	@Override
	public List<Owners_Post> send_back(String user_email) {
		
		List<Owners_Post>  lists =jdbc.query("select * from  Busniess_details where email='"+user_email+"'", new RowMapper<Owners_Post>() {

			@Override
			public Owners_Post mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Owners_Post  posting =  new Owners_Post();
				posting.setBusniess_ad(rs.getString(2));
				posting.setPhones(rs.getString(3));
				posting.setMember_type(rs.getString(4));
				
				return posting;
			}});
			return lists;
			}




	@Override
	public Model_i update_user_profile_pic(String img_url, String email) {
			
		Model_i b;	
		int  x= jdbc.update("update User_Reg set pic_path ='"+img_url+"' where email ='"+email+"'");
		System.out.println(x);
		if(x == 1) {
		      b = new Model_i();
		      b.setUser(img_url);
		    }
		else
			{
			  b = new Model_i();
		      b.setUser("Error");
			}
		
		
		return b;
	}








	
	

	


	
}
