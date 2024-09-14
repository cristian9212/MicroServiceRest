package MicroService.MicroService;

import org.springframework.web.bind.annotation.*;

/**
 * @author Cristian Talero
 */
@RestController
public class UserController {

//Ejemplo de la Api para encontrar un usuario con Id.
@GetMapping("/user/{id}")
public String getUserById(@PathVariable String id){
    return "El Id del Usuario es "+ id;
}

//Ejemplo para guardar un usuario creado.
@PostMapping("/users")
public String createUser(@RequestBody String user) {
    return "Usuario creado "+ user;
}
}
