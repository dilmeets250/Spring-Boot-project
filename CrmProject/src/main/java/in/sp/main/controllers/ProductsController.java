package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsController
{
	@PostMapping("/addProducts")
	public String openAddProductsPage()
	{
		return "add-products";
	}
}
