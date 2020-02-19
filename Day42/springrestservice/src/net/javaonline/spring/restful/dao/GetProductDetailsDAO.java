package net.javaonline.spring.restful.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import net.javaonline.spring.restful.model.ProductDetails;

@Repository
public class GetProductDetailsDAO {

	Map<String, ProductDetails> products = new HashMap<String, ProductDetails>();

	public GetProductDetailsDAO() {

		// product details to be retrieved from the database.

//		products.put("1", new ProductDetails("1", "LCD TV"));
//		products.put("2", new ProductDetails("2", "LED TV"));
//		products.put("3", new ProductDetails("3", "AC"));
//		products.put("4", new ProductDetails("4", "Laptop"));

	}

	public ProductDetails getProductDetails(String itemcode) throws Exception {
		if (products.containsKey(itemcode))
			return products.get(itemcode);
		throw new Exception();
	}

	public List<ProductDetails> getAllProductDetails() {
		System.out.println("db code");
		ProductDetails pd = null;
		List<ProductDetails> list = new ArrayList<>();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from prod");
		
		while (rs.next()) {
			pd=new ProductDetails();
			pd.setItemcode(rs.getString(1));
			pd.setDescription(rs.getString(2));
			System.out.println("data::"+pd.getDescription());
			list.add(pd);
		}
		}catch(Exception e) {e.printStackTrace();}
		return list;
	}

	public ProductDetails addProductDetails(String pId, ProductDetails newProduct) {
		ProductDetails pd = products.put(pId, newProduct);
		System.out.println("Product added::");
		return pd;
	}

	public ProductDetails delProductDetails(String pId) {
		ProductDetails pd = products.remove(pId);
		System.out.println("deleted:::" + pd.getItemcode());
		return pd;
	}
}
