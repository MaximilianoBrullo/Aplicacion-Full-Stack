package com.Sistema.rrhh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.Sistema.rrhh.entity.Empleado;
import com.Sistema.rrhh.service.EmpleadoService;

@RestController//Indica que es un controlador de tipo REST
@RequestMapping("rh-app")//http://localhost:8080/rh-app/
@CrossOrigin(value = "http://localhost:3000")//Permite que el front pueda acceder a este back
public class EmpleadoController {
    private static final Logger logger = 
        LoggerFactory.getLogger(EmpleadoController.class);
        //Logger para registrar información en la consola

    @Autowired//Permite inyectar la dependencia de EmpleadoService en el controlador
    private EmpleadoService empleadoService;

    //http://localhost:8080/rh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> getAllEmpleados(){
        var empleados = empleadoService.getAllEmpleados();
        logger.info("Se han obtenido {} empleados", empleados.size());
        empleados.forEach(empleado -> logger.info("Empleado: {}", empleado.toString()));
        return empleados;
    }
}
