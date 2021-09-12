package models;



public class Model_a {
	
	private String id,fabric_name,fabric_category,fabric_in_stock,
	         fabric_path,fabric_owner,fabric_address,fabric_price,
	         time_stamp;

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    

	public String getFabric_name() {
		return fabric_name;
	}

	public void setFabric_name(String fabric_name) {
		this.fabric_name = fabric_name;
	}

	public String getFabric_category() {
		return fabric_category;
	}

	public void setFabric_category(String fabric_category) {
		this.fabric_category = fabric_category;
	}

	public String getFabric_in_stock() {
		return fabric_in_stock;
	}

	public void setFabric_in_stock(String fabric_in_stock) {
		this.fabric_in_stock = fabric_in_stock;
	}

	public String getFabric_path() {
		return fabric_path;
	}

	public void setFabric_path(String fabric_path) {
		this.fabric_path = fabric_path;
	}

	public String getFabric_owner() {
		return fabric_owner;
	}

	public void setFabric_owner(String fabric_owner) {
		this.fabric_owner = fabric_owner;
	}

	public String getFabric_address() {
		return fabric_address;
	}

	public void setFabric_address(String fabric_address) {
		this.fabric_address = fabric_address;
	}

	public String getFabric_price() {
		return fabric_price;
	}

	public void setFabric_price(String fabric_price) {
		this.fabric_price = fabric_price;
	}

	public String getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	
	

	@Override
	public String toString() {
		return "Model_a [id=" + id + ", fabric_name=" + fabric_name + ", fabric_category=" + fabric_category
				+ ", fabric_in_stock=" + fabric_in_stock + ", fabric_path=" + fabric_path + ", fabric_owner="
				+ fabric_owner + ", fabric_address=" + fabric_address + ", fabric_price=" + fabric_price
				+ ", time_stamp=" + time_stamp + "]";
	}

    
    
    
    
    
    
}