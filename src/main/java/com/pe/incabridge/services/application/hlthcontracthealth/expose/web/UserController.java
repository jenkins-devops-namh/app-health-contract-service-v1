package com.pe.incabridge.services.application.hlthcontracthealth.expose.web;

import com.pe.incabridge.core.exception.ApiException;
import com.pe.incabridge.services.application.hlthcontracthealth.business.UserService;
import com.pe.incabridge.services.application.hlthcontracthealth.model.api.UserResponse;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.*;


/**
 * Controlador principal que expone el servicio a trav&eacute;s de HTTP/Rest
 * para las operaciones del recurso ContractOrganizationProduct.<br/>
 * <b>Class</b>: ContractOrganizationProductController<br/>
 * <b>Copyright</b>: &copy; 2020 Banco de Cr&eacute;dito del Per&uacute;<br/>
 * <b>Company</b>: Banco de Cr&eacute;dito del Per&uacute;<br/>
 *
 * @author Banco de Cr&eacute;dito del Per&uacute; (BCP) <br/>
 * <u>Service Provider</u>: EVERIS <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>Giancarlo Yarleque</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>Ago 06, 2020 Creaci&oacute;n de Clase.</li>
 * </ul>
 * @version 1.0
 */
@RestController
@RequestMapping("")
@Schema(description = "User", name = "User")
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * findProductDetailByContractId.
   * Método para obtener los productos por contrato
   *
   * @param httpRequest request.
   * @param userId identificador del contrato.
   * @param password Optional Codigo del Servicio
   * @return ContractOrganizationServiceGetResponse.
   */
  @GetMapping(value = "/finduser/{userId}/user",
      produces = { MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
  @Operation(summary = "Obtiene el detalle de los productos por contrato",
          method = "GET", tags = { "Contract" },
          description = "classpath:swagger/notes/contract/findProductDetailByContractId.md")
  @ApiResponses({
          @ApiResponse(responseCode = "200",
            description = "Información de productos por contrato",
            content = {
                @Content(array = @ArraySchema(schema = @Schema(implementation =
                        UserResponse.class)))
          }),
          @ApiResponse(responseCode = "404",
            description = "El contrato y/o el servicio no existe",
            content = {
                  @Content(schema = @Schema(implementation = ApiException.class))
            }),
          @ApiResponse(responseCode = "500",
            description =
              "Ocurrio un error inesperado. Por favor contactarse con el Soporte Tecnico.",
            content = {
                    @Content(schema = @Schema(implementation =
                            ApiException.class))
            }),
      })
  public Maybe<UserResponse> findUser(
          ServerHttpRequest httpRequest,
         @Parameter(name = "UserId", description = "Número de Contrato",
                 schema = @Schema(type = "string"), required = true, example = "0010Q5")
         @PathVariable String userId,
         @Parameter(name = "password", description = "Codigo del Servicio",
                 schema = @Schema(type =  "string"), required = false, example = "SE001")
         @RequestParam(required = false, defaultValue = "") String password
 ) {
    return userService.findUser(userId, password);
  }

}
