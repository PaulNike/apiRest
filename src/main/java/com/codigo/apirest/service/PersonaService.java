package com.codigo.apirest.service;

import com.codigo.apirest.entity.PersonaEntity;

public interface PersonaService {
    PersonaEntity guardarPersona(PersonaEntity persona);

    PersonaEntity actualizarPersona(PersonaEntity persona);
}
