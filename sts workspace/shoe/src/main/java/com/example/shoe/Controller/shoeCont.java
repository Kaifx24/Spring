
	package com.example.shoe.Controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoe.service.shoeService;
import com.example.shoe.Model.ShoeModel;

	@RestController
	public class shoeCont {

		@Autowired
		shoeService shser;
		
		@GetMapping("/getshoe")
	    public List<ShoeModel> main()
	    {
	    	return shser.main();
	    }
	    @PostMapping("/postshoe")
	    public ShoeModel sub(@RequestBody ShoeModel sh)
	    {
	    	return shser.sub(sh);
	    }
	    @PutMapping("/putshoe")
	    public ShoeModel dub(@RequestBody ShoeModel sh)
	    {
	    	return shser.dub(sh);
	    }
	    @DeleteMapping("/del/{cost}")
	    public void delete(@PathVariable("cost") int cost) {
	    	shser.del(cost);
	    }
	}

