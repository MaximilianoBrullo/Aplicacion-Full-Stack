package com.Sistema.rrhh.service;

import com.Sistema.rrhh.entity.Empleado;
import com.Sistema.rrhh.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {
    
    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleadoById(Integer idEmpleado) {
        return empleadoRepository.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteEmpleado(Integer idEmpleado) {
        empleadoRepository.deleteById(idEmpleado);
    }
}
