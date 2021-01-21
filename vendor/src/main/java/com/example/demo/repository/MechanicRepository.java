package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mechanic;





@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Integer>{

	@Query(value="select * from mechanic where ven_id=:ven_id",nativeQuery=true)
	List<Mechanic> findMechanicByuserId(@Param("ven_id") int ven_id);

}
