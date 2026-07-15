package controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/materials")
public class MaterialController implements Serializable {

	private static final long serialVersionUID = 1L;

}
