package com.fileuploaddemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FileController {

	@PostMapping("/uploadfile")
	public ModelAndView uploadFile(@RequestParam("myfile") MultipartFile file, HttpServletRequest req) {
		String path=req.getServletContext().getRealPath("/")+
				"WEB-INF"+File.separator+"resources"
				+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fout = new FileOutputStream(path);
			byte[] data = file.getBytes();
			fout.write(data);
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("image", file.getOriginalFilename());
		return mv;
	}
}
