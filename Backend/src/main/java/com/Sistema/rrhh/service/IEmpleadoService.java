package com.Sistema.rrhh.service;

import com.Sistema.rrhh.entity.Empleado;
import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> getAllEmpleados();

    public Empleado getEmpleadoById(Integer idEmpleado);

    public Empleado saveEmpleado(Empleado empleado);

    public void deleteEmpleado(Integer idEmpleado);
}
