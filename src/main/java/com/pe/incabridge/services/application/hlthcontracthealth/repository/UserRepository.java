package com.pe.incabridge.services.application.hlthcontracthealth.repository;

import com.pe.incabridge.services.application.hlthcontracthealth.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


/**
 * OrganizationRepository.
 * Repository: OrganizationRepository<br/>
 * Copyright: &copy; 2018 Banco de Cr&eacute;dito del Per&uacute;<br/>
 * Company: Banco de Cr&eacute;dito del Per&uacute;<br/>
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * <u>Service Provider</u>: Everis Per&uacute; SAC (EVE) <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Ragnarok</li>
 * </ul>
 *     Changes:<br/>
 * <ul>
 * <li>2020-08-11 (CC) Creaci&oacute;n de Clase.</li>
 * </ul>
 * @version 1.0
 */
public interface UserRepository
    extends CrudRepository<UserEntity, String> {
}
