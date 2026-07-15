package controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController implements Serializable {

	private static final long serialVersionUID = 1L;

}
