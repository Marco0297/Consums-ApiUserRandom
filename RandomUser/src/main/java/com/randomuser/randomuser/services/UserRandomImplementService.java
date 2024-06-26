package com.randomuser.randomuser.services;

import com.randomuser.randomuser.dto.RootDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserRandomImplementService implements IUserRandomService{

    @Value("${spring.consume-api.url}")
    private String urlPath;

    private final RestTemplate restTemplate = new RestTemplate();


    /**
     * Retorna un solo usuario
     * @return
     */
    @Override
    public RootDto getUser() {
        return  restTemplate.getForObject(urlPath, RootDto.class);

    }

    /**
     * Retorna n cantidad de usuarios a buscar
     * @param num
     * @return
     */
    @Override
    public RootDto getNUser(int num) {
        return restTemplate.getForObject(urlPath+"?results="+num, RootDto.class);
    }

    /**
     * Retorna solo usuario femenino
     * @return
     */
    @Override
    public RootDto justFemale() {
        return restTemplate.getForObject(urlPath+"?gender=female", RootDto.class);
    }

    /**
     * Retorna solo usuario masculino
     * @return
     */
    @Override
    public RootDto justMale() {
        return restTemplate.getForObject(urlPath+"?gender=male", RootDto.class);
    }

    /**
     * Muestra en formato Json
     * En lugar de retornar el RootDto, retornara un String
     * NOTA: NO SE PUEDE DESCARGAR DIRECTAMENTE CON CONSUMIR LA API, SE DEBE DE GUARDAR EN
     *      * UN STRING PARA POSTERIORMENTE HACER LA DESCARGA EN EL FORMATO JSON
     * @return
     */
    @Override
    public String getJsonFormat() {
        return restTemplate.getForObject(urlPath+"?format=json", String.class);
    }

    /**
     * Descarga en formato csv
     * NOTA: NO SE PUEDE DESCARGAR DIRECTAMENTE CON CONSUMIR LA API, SE DEBE DE GUARDAR EN
     * UN STRING PARA POSTERIORMENTE HACER LA DESCARGA EN EL FORMATO CSV
     * @return
     */
    @Override
    public String getCsvFormat() {
        return restTemplate.getForObject(urlPath+"?format=csv", String.class);
    }

    /**
     * Descarga en formato xml
     * NOTA: NO SE PUEDE DESCARGAR DIRECTAMENTE CON CONSUMIR LA API, SE DEBE DE GUARDAR EN
     * UN STRING PARA POSTERIORMENTE HACER LA DESCARGA EN EL FORMATO CSV
     * @return
     */
    @Override
    public String getXmlFormat() {
        return restTemplate.getForObject(urlPath+"?format=xml", String.class);
    }


}
