package com.codigo.apirest.service.impl;

import com.codigo.apirest.dao.AutomovilDAO;
import com.codigo.apirest.entity.Automovil;
import com.codigo.apirest.request.VehiculoReq;
import com.codigo.apirest.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomovilServiceImpl implements AutomovilService {

    @Autowired
    private AutomovilDAO automovilDAO;
    @Override
    public Automovil guardarAuto(VehiculoReq vehiculoReq) {
        Automovil automovil = new Automovil();
        automovil.setBrand(vehiculoReq.getBrand());
        automovil.setModelo(vehiculoReq.getModelo());
        automovil.setAnio(vehiculoReq.getAnio());
        automovil.setPlaca(vehiculoReq.getPlaca());
        automovil.setMarca(vehiculoReq.getMarca());
        automovil.setAsientos(vehiculoReq.getAsientos());
        automovil.setCombustible(vehiculoReq.getTipoCombustible());
        return automovilDAO.save(automovil);
    }
}
