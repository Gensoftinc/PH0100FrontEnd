package com.gensoft.ph.product.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.gensoft.ph.common.Constant;
import com.gensoft.ph.product.model.ProductCategory;

@Controller
public class ProductDetailsController {

	
	
	@RequestMapping(value = "/showSingleProductDetails", method = RequestMethod.GET)
	public ModelAndView showSingleProductDetails(HttpServletRequest req, HttpServletResponse res )
	{
		ModelAndView model=new ModelAndView("single_product_details");
		
		return model;
	}
	
	
}
