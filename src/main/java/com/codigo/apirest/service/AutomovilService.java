package com.codigo.apirest.service;

import com.codigo.apirest.entity.Automovil;
import com.codigo.apirest.request.VehiculoReq;

public interface AutomovilService {

    Automovil guardarAuto(VehiculoReq vehiculoReq);
}
