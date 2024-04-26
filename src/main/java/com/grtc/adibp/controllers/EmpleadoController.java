package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.EmpleadoEntity;
import com.grtc.adibp.services.EmpleadoServiceImpl;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/adibp/empleados")
@PreAuthorize("hasRole('ADMIN')")
public class EmpleadoController extends BaseControllerImpl<EmpleadoEntity, EmpleadoServiceImpl>{
}
