package com.dime_io.in;


public class Owners_Post {

   private String busniess_ad,phones,member_type;

   Owners_Post(){

   }

   
   
   

    public String getMember_type() {
	return member_type;
    }


	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}


	public void setBusniess_ad(String busniess_ad) {
	this.busniess_ad = busniess_ad;
    }


	public void setPhones(String phones) {
		this.phones = phones;
	}


	public String getBusniess_ad() {
        return busniess_ad;
    }


    public String getPhones() {
        return phones;
    }


}
