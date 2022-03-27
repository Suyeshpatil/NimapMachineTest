package com.example.project.Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.Management.dto.OrderResponse;
import com.example.project.Management.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
	@Query("select new com.example.project.Management.dto.OrderResponse( c.name,p.productName) From Category c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();
}
