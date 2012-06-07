package com.karatebancho;

import org.springframework.stereotype.Component;

import com.karatebancho.entity.Order;

@Component
public class ItemOrderResource implements OrderResource {

	@Override
	public Order create(Order order) {
		System.out.println("hoge");
		return order;
	}

}
