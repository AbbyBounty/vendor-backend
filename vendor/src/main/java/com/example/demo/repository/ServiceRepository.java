package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Service_Taken_Vendor;




@Repository
public interface ServiceRepository extends JpaRepository<Service_Taken_Vendor, Integer>{

	@Query(value="select * from service where ven_id=:ven_id",nativeQuery=true)
	public List<Service_Taken_Vendor> findservicesByuserId(@Param("ven_id") int ven_id);

}
