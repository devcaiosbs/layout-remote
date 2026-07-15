package controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tests")
public class TestController implements Serializable {

	private static final long serialVersionUID = 1L;

}
