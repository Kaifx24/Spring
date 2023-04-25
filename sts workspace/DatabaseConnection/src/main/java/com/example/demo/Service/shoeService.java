
	package com.example.demo.Service;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	import com.example.demo.Model.ShoeModel;
	import com.example.demo.Repository.ShoeRepos;

	@Service
	public class shoeService {

		@Autowired
		ShoeRepos shre;
		
		public List<ShoeModel> main(){
			return shre.findAll();
		}
		public ShoeModel sub (ShoeModel sm)
		{
			return shre.save(sm);
		}
		public ShoeModel dub (ShoeModel sm)
		{
			return shre.save(sm);
		}
		public void del (int cost)
		{
			shre.deleteById(cost);
		}
		
	}

