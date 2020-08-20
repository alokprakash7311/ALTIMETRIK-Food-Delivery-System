package com.food.delivery.app.ws.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.app.ws.io.entity.FoodEntity;
import com.food.delivery.app.ws.io.repository.FoodRepository;
import com.food.delivery.app.ws.service.FoodService;
import com.food.delivery.app.ws.shared.Utils;
import com.food.delivery.app.ws.shared.dto.FoodDto;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	FoodRepository foodRepository;
	
    @Autowired
	Utils utils;
	
	@Override
	public FoodDto createFood(FoodDto food) {

		ModelMapper modelMapper = new ModelMapper();
		FoodEntity foodEntity = modelMapper.map(food, FoodEntity.class);
		
		String publicFoodId = utils.generateFoodId(30);
		foodEntity.setFoodId(publicFoodId);
		
		FoodEntity storedFood = foodRepository.save(foodEntity);
		
		FoodDto foodDto = new FoodDto();
		foodDto = modelMapper.map(storedFood, FoodDto.class);		
		
		return foodDto;
	}

	@Override
	public FoodDto getFoodById(String foodId) {
		
		return null;
	}

	@Override
	public FoodDto updateFoodDetails(String foodId, FoodDto foodDetails) {
		
		return null;
	}

	@Override
	public void deleteFoodItems(String id) {
		
		
	}

	@Override
	public List<FoodDto> getFoods() {
		
		return null;
	}

}
