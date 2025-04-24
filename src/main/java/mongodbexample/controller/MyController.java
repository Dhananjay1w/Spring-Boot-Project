package mongodbexample.controller;

import mongodbexample.models.User;
import mongodbexample.rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class MyController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity<?> addUser(@RequestBody User user)
    {
        User save= this.userRepository.save(user);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getUsers()
    {
        return ResponseEntity.ok(this.userRepository.findAll());
    }
}
