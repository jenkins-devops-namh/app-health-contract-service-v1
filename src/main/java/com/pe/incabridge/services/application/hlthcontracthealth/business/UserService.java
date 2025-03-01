package com.pe.incabridge.services.application.hlthcontracthealth.business;

import com.pe.incabridge.services.application.hlthcontracthealth.model.api.UserResponse;
import io.reactivex.Maybe;

/**
 * ContractService.
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * @version 1.0
 */
public interface UserService {

  Maybe<UserResponse> findUser(
          String user, String password);
}
