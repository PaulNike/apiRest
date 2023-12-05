package com.codigo.apirest.controller;

import com.codigo.apirest.entity.Automovil;
import com.codigo.apirest.request.VehiculoReq;
import com.codigo.apirest.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private AutomovilService automovilService;

    @PostMapping("/grabar")
    public Automovil crearVehiculo(@RequestBody VehiculoReq vehiculoReq){
        return automovilService.guardarAuto(vehiculoReq);
    }
}
