package com.example.project.Management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Management.dto.OrderRequest;
import com.example.project.Management.dto.OrderResponse;
import com.example.project.Management.entity.Category;
import com.example.project.Management.entity.Product;
import com.example.project.Management.repository.CategoryRepository;
import com.example.project.Management.repository.ProductRepository;

@RestController
public class OrderController {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	//saving the data/adding the data
	@PostMapping("/saveorder")
	public Category placeOrder(@RequestBody OrderRequest request) {
		return categoryRepository.save(request.getCategory());
	}
	//update the data
	@PutMapping("/update")
	public Category update(@RequestBody OrderRequest request) {
		return categoryRepository.save(request.getCategory());
	}
	//Getting all data
	@GetMapping("/findAllOrders")
	public List<Category> findAllOrders(){
		return categoryRepository.findAll();
	}
	
	//Get info all category
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInfo(){
		return categoryRepository.getJoinInformation();
	}
	//get Category by Id
	@GetMapping("/{id}")
	public Optional<Category> findById(@PathVariable int id){
		return categoryRepository.findById(id);
	}
	
	//get product by Id
	@GetMapping("/pid{pid}")
	public Optional<Product> findById_1(@PathVariable int pid){
		return productRepository.findById(pid);
	}
	
	//product deleting
	@DeleteMapping("/pdel{pid}")
	public String delete(@PathVariable int pid){
		productRepository.deleteById(pid);
		return "Product record deleted successfuly...";
	}
	//Category Deleting
	@DeleteMapping("/cdel{id}")
	public String delete_category(@PathVariable int id){
		categoryRepository.deleteById(id);
		return "Category record deleted successfuly...";
		}
		
	//using Pagination operation on category
	
	@GetMapping("/c-pag{offset}/{pagesize}")
	public Page<Category> PagionationMethod_category(@PathVariable int offset,@PathVariable int pagesize){
		return categoryRepository.findAll(PageRequest.of(offset,pagesize));
		
	}
	@GetMapping("/p-pag{offset}/{pagesize}")
	public Page<Product> PagionationMethod_product(@PathVariable int offset,@PathVariable int pagesize){
		return productRepository.findAll(PageRequest.of(offset,pagesize));
		
	}		
}
