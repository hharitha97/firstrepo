package com.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.VendorContactBean;

public interface IVendorContactDAO {

	public abstract void setTemplate(JdbcTemplate template);

	// view vendor and contact details
	public abstract List<VendorContactBean> viewVendorContactList();

	public abstract int insertVendor(VendorContactBean vc);

	public abstract int updateVendor(VendorContactBean vc);

	//search
	public abstract List<VendorContactBean> getBySearch(String searchString);

	//Disable vendor
	public abstract int disableVendor(int vendorId);

	// Login
	public abstract VendorContactBean verifyLogin(String username,
			String password);

	// view vendor and contact details by id
	public abstract List<VendorContactBean> getById(int vendorId);

}