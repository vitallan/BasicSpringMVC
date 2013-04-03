package basic.spring.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class BasicController {
	
	private static Logger log = Logger.getLogger(BasicController.class);
	
	public BasicController(){
		log.info(this.getClass()+" Iniciado");
	}
	
	@RequestMapping(value="/")
	public ModelAndView home(HttpServletResponse response) throws IOException {
		log.info("Im at the view");
		ModelAndView model = new ModelAndView("helloworld");
		model.addObject("msg", "hello world");
		return model;
	}
	
}
