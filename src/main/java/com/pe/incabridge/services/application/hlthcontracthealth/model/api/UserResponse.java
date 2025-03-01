package com.pe.incabridge.services.application.hlthcontracthealth.model.api;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {
  private String usuario;
  private String usuarioPerfil;
  private String nombre;
  private String clave;
  private Character expirarPasswordFlag;
  private Date fechaExpiracion;
  private Date ultimoLogin;
  private Integer numeroLoginsDisponible;
  private Integer numeroLoginsUsados;
  private String usuarioRed;
  private String sQLLogin;
  private String sQLPassword;
  private Character estado;
  private String ultimoUsuario;
  private Date ultimaFechaModif;
  private byte[] minucia;
  private Integer indicador;
  private Integer persona;
  private Integer personaNumero;
}