package de.plaetzinger.demo.dockerselenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Christian Plätzinger
 */
@Controller
@RequestMapping(name = "/")
public class IndexController {

	@GetMapping
	public String getIndextAsHtml() {
		return "index";
	}
}
