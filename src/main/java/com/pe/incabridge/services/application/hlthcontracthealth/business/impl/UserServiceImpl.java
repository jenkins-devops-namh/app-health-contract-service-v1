package com.pe.incabridge.services.application.hlthcontracthealth.business.impl;



import com.pe.incabridge.services.application.hlthcontracthealth.business.UserService;
import com.pe.incabridge.services.application.hlthcontracthealth.mapper.UserMapper;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.UserResponse;
import com.pe.incabridge.services.application.hlthcontracthealth.repository.UserRepository;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * ContractServiceImpl.
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper userMapper;


  @Override
  public Maybe<UserResponse> findUser(String user, String password) {
      var xx = userRepository.findById(user).map(userMapper::toUserResponse).get();
      return Maybe.just(xx);
  }
}