package com.example.demo.repos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;
	
@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int add(Product t) {
		String sql = "insert into achu_product values(?,?,?)";
		return template.update(sql, t.getProductId(), t.getProductName(), t.getPrice());
		
	}

	@Override
	public List<Product> findAll() {
		String sql = "SELECT*from achu_product";
		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
		
	}

	@Override
	public Product findById(int id) {
		try{
			return template.queryForObject( "SELECT*from achu_product where product_id=?",
					BeanPropertyRowMapper.newInstance(Product.class),id);
		}catch (IncorrectResultSizeDataAccessException e){
			return null;
		}


	}

	@Override
	public int update(Product t) {
		return template.update("update achu_product set product_Name=?,price=? where product_id=?",
				new Object[]{t.getProductName(),t.getPrice(),t.getProductId()});
		
	}

	@Override
	public int remove(int id) {
		return template.update("delete from achu_product where product_Id=?",id);
	}

}
