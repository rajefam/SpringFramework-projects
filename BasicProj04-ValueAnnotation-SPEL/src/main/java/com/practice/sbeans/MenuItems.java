package com.practice.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menuitems")
@Data
public class MenuItems {
	
	
	@Value("${menu.dosarate}")
	public Float dosaPrice;
	@Value("${menu.idlyrate}")
	public Float idlyPrice;
	@Value("${menu.poharate}")
	public  Float pohaPrice;
	@Value("${menu.vprate}")
	public  Float vadaPavPrice;
	
	
//	@Override
//	public String toString() {
//		return "MenuItemPrices [dosaPrice=" + dosaPrice + ", idlyPrice=" + idlyPrice + ", pohaPrice=" + pohaPrice
//				+ ", vadaPavPrice=" + vadaPavPrice + "]";
//	}
}
