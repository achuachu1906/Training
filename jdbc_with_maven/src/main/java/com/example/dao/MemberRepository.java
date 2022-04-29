package com.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
	private Connection con;
    
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		int rowAdded=0;
		String sql="insert into achumember101 values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMemberName());
			pstmt.setString(3, obj.getMemberAddress());
			pstmt.setDate(4, obj.getAccountOpenDate());
			pstmt.setString(5, obj.getMemberShipType());
			pstmt.setDouble(6, obj.getFeesPaid());
			pstmt.setInt(7, obj.getMaxBookAllowed());
			pstmt.setDouble(8, obj.getPenaltyAmount());
			rowAdded=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}

	public List<Member> findAll() {
		String sql="select*from achumember101";
		List<Member> mem=new ArrayList<Member>();
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int memberId = rs.getInt("member_id");
				String memberName=rs.getString("member_name");
				String memberAddress=rs.getString("member_Address");
				LocalDate date=LocalDate.of(2022, 4, 12);
	        	Date sqlDate=Date.valueOf(date);
				Date accOpenDate=rs.getDate("Acc_Open_Date");
				String membershipType=rs.getString("Membership_Type");
				int feesPaid=rs.getInt("Fees_Paid");
				int maxBooksAllowed=rs.getInt("Max_Books_Allowed");
				int penaltyAmount=rs.getInt("Penalty_Amount");
				
	Member memb=new Member(memberId,memberName,memberAddress,accOpenDate,membershipType,feesPaid,maxBooksAllowed,penaltyAmount);
	mem.add(memb);
				
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return mem;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
