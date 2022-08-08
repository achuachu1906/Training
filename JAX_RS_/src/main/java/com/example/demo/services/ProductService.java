package com.example.demo.services;
import java.sql.*;

import java.util.*;
import com.example.entity.*;
import com.example.util.ConnectionFactory;
public class ProductService {
	private Connection con;

	public ProductService() {
		super();
		this.con = ConnectionFactory.getOracleConnection();
	}
	public int updatePriceByName(String productName,double newPrice) {
		int rowsUpdated=0;
		String sql ="update achu_product set price=? where product_name=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(2, productName);
			pstmt.setDouble(1, newPrice);
			rowsUpdated =pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
			
		return rowsUpdated;
	}
	public int deleteById(int id) {
		int rowsDeleted=0;
		String sql="delete from achu_product where product_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,id);
			rowsDeleted=pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id){
		Optional<Product> obj=Optional.empty();
		String sql ="select * from achu_product where product_id=?";
	    try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {

				int productId = rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price=rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				obj=Optional.of(prod);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return obj;
	}
	
	public int addProduct(Product product) {
		int rowAdded=0;
		String sql="insert into achu_product values(? ,? ,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			rowAdded=pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}
	

	public List<Product> findAll(){
		List<Product> productList = new ArrayList<Product>();
		String sql ="select*from achu_product";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
			
				
				int productId = rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price=rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				productList.add(prod);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
		
	}
	public void usingTxn(Product prd1,Product prd2) {
		String sql="insert into achu_product values(?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			con.setAutoCommit(false);
			pstmt.setInt(1, prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			
			int rowAdded=pstmt.executeUpdate();
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3, prd2.getPrice());
			
			int rowAdded2 =pstmt.executeUpdate();
			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}
			else {
				con.rollback();
			}
			
			System.out.println("Row Added:="+ rowAdded);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
