package com.gensoft.ph.product.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.gensoft.ph.common.Constant;
import com.gensoft.ph.product.model.GetCatAndSubCat;
import com.gensoft.ph.product.model.ProductCategory;

public class CategoryController {
	
	@RequestMapping(value="/getCategoryAndSubByType", method=RequestMethod.GET)

	public @ResponseBody List<GetCatAndSubCat> getCategoryAndSubByType(HttpServletRequest request)
	{
		List<GetCatAndSubCat> productCategory=new ArrayList<GetCatAndSubCat>();
		
		String type=request.getParameter("type");
		MultiValueMap<String, Object> map=new LinkedMultiValueMap<String, Object>();
		map.add("type",type);//hard coded

		RestTemplate rest=new RestTemplate();
		
		try {
			productCategory=rest.postForObject(Constant.url+"getCatAndSubByType", map, List.class);
		System.out.println("Res  +"+productCategory.toString());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return productCategory;
		
	}	

}
