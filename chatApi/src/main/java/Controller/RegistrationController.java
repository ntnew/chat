package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import services.UserService;

@Controller
public class RegistrationController {

  @Autowired
  private UserService userService;

  @PostMapping("/reg")
  public ResponseEntity regUser(){
    return null;
  }
}
