package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Vendor;



@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer>{
	
	@Query(value="select * from vendor where ven_email=:ven_email and ven_password=:ven_password",nativeQuery=true)
	public List<Vendor> findByVen_emailAndVen_password(@Param("ven_email") String ven_email, @Param("ven_password") String ven_password);
}
