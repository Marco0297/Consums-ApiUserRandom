package com.randomuser.randomuser.services;

import com.randomuser.randomuser.dto.RootDto;

public interface IUserRandomService {
    /**
     * Trae un usuario
     * @return
     */
    public RootDto getUser();

    /**
     * Trae n canttidad de usuarios
     * @param num
     * @return
     */
    public RootDto getNUser(int num);

    /**
     * Solo buscar usuario femenino
     * @return
     */
    public RootDto justFemale();

    /**
     * Solo buscar usuario masculino
     * @return
     */
    public RootDto justMale();

    /**
     * Descarga format json
     */
    public String getJsonFormat();

    /**
     * Descarga format cvs
     */
    public String getCsvFormat();

    /**
     * Descarga format xml
     */
    public String getXmlFormat();


}
