package com.training.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


import com.example.ifaces.CrudRepository;
import com.training.loanApplication;

public class CustomerService implements CrudRepository<loanApplication> {
	private Connection con;
	

	public CustomerService(Connection con) {
		super();
		this.con = con;
	}

	public int add(loanApplication obj) {
		int rowAdded=0;
		String sql="insert into achu1_customer values(?,?,?,?)";
		String loan="insert into loan1_application values(?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql);
		   PreparedStatement stmt2=con.prepareStatement(loan)){
        stmt.setInt(1, obj.getCustomer().getCustomerId());
        stmt.setString(2, obj.getCustomer().get);
        
	     
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return 0;
	}

	public List<loanApplication> findAll() {
		
	List<loanApplication> appList = new ArrayList<loanApplication>();
	
	String sql="select ac.customer_id,ac.customer_name,ac.phone_number,ac.credit_score,al.application_number,al.customer,al.loan_amount from achu1_customer ac,achu1_loanapplication al where ac.customer_id= al.customer";
	
	try (PreparedStatement stmt=con. prepareStatement(sql)){
		
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
		
			
			int customerId= rs.getInt(1);
			String customerName=rs.getString(2);
			long phoneNumber=rs.getLong(3);
			double creditScore=rs.getDouble(4);
			int applicationNumber=rs.getInt(5);
			int customer=rs.getInt(6);
			double loanAmount=rs.getDouble(7);
			
			Customer cus=new Customer(customerId, customerName, phoneNumber, creditScore);
			loanApplication loan=new loanApplication(applicationNumber, cus, loanAmount);
			
			
			appList.add(loan);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return appList;
	
}
		
	

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public loanApplication findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, loanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}
}