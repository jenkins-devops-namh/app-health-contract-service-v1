package com.pe.incabridge.services.application.hlthcontracthealth.model.entity;

import lombok.*;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
public class UserEntity {
    @Id
    @Size(max = 20)
    @Column(name = "usuario", nullable = false, length = 20)
    private String usuario;

    @Size(max = 2)
    @Column(name = "usuarioperfil", length = 2)
    private String usuarioPerfil;

    @Size(max = 50)
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Size(max = 100)
    @Column(name = "clave", length = 100)
    private String clave;

    @Column(name = "expirarpasswordflag")
    private Character expirarPasswordFlag;

    @Column(name = "fechaexpiracion")
    private Date fechaExpiracion;

    @Column(name = "ultimologin")
    private Date ultimoLogin;

    @Column(name = "numerologinsdisponible")
    private Integer numeroLoginsDisponible;

    @Column(name = "numerologinsusados")
    private Integer numeroLoginsUsados;

    @Size(max = 25)
    @Column(name = "usuariored", length = 25)
    private String usuarioRed;

    @Size(max = 20)
    @Column(name = "sqllogin", length = 20)
    private String sQLLogin;

    @Size(max = 10)
    @Column(name = "sqlpassword", length = 10)
    private String sQLPassword;

    @Column(name = "estado")
    private Character estado;

    @Size(max = 25)
    @Column(name = "ultimousuario", length = 25)
    private String ultimoUsuario;

    @Column(name = "ultimafechamodif")
    private Date ultimaFechaModif;

    @Column(name = "minucia")
    private byte[] minucia;

    @Column(name = "indicador")
    private Integer indicador;

    @Column(name = "persona")
    private Integer persona;

    @Column(name = "personanumero")
    private Integer personaNumero;
}