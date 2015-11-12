package com.kvvssut.iobapp.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kvvssut.iobapp.spring.dao.UserDAO;
import com.kvvssut.iobapp.spring.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private UserDAO userDao;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
	public ModelAndView getUserDetails() {
		List<User> listUsers = userDao.list();
		ModelAndView model = new ModelAndView("home");
		model.addObject("userList", listUsers);
		logger.info(
				"Inside HomeController : Size of returned list of users is {}",
				listUsers.size());
		return model;
	}

}
