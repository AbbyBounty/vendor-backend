package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Offer;





@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer>{

	@Query(value="select * from offer where ven_id=:ven_id",nativeQuery=true)
	List<Offer> findOfferByUserId(@Param("ven_id") int id);

}
