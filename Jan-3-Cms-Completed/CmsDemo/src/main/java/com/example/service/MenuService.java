package com.example.service;

import java.util.List;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Menu;
import com.example.repo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> showMenu() {
		return menuRepository.findAll();
	}
	
	public ResponseEntity<Menu> searchByMenuId(int menuId) {
		Menu menu = menuRepository.findById(menuId).orElseThrow(
				() -> new ResourceNotFoundException("Menu with Id " +menuId + " Not Found")
				);

			    return new ResponseEntity<>(menu, HttpStatus.OK);
	}
}
