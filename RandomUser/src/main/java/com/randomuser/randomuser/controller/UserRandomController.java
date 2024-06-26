package com.randomuser.randomuser.controller;

import com.randomuser.randomuser.dto.RootDto;
import com.randomuser.randomuser.services.IUserRandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v2")
public class UserRandomController {

    @Autowired
    private IUserRandomService service;

    /**
     * Traer solo 1 usuario
     * @return
     */
    @GetMapping("/getUser")
    public ResponseEntity<RootDto> getUser(){
        RootDto user = service.getUser();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /**
     * Endpoint para varios usuarios
     * @param num
     * @return
     */
    @GetMapping("/getUsers/{num}")
    public ResponseEntity<RootDto>getUsers(@PathVariable int num){
        RootDto users = service.getNUser(num);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /**
     * Endpoint para traer solo usuarios femeninos
     * @return
     */
    @GetMapping("/getUserFemale")
    public ResponseEntity<RootDto>getUserFemale(){
        return new ResponseEntity<>(service.justFemale(), HttpStatus.OK);
    }

    /**
     * Endpoint para traer solo usuarios masculino
     * @return
     */
    @GetMapping("/getUserMale")
    public ResponseEntity<RootDto>getUserMale(){
        return new ResponseEntity<>(service.justMale(), HttpStatus.OK);
    }

    /**
     * Endpoint para descargar en formato json
     * "attachment" indica al navegador que es un archivo adjunto descargable
     * @return
     */
    @GetMapping("/getJson")
    public ResponseEntity<byte[]>dowloandJsonFile(){
        String data = service.getJsonFormat();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);//Interpreta el contenido recibido
        httpHeaders.setContentDispositionFormData("attachment", "randomUser.json");
        return new ResponseEntity<>(data.getBytes(), httpHeaders ,HttpStatus.OK);
    }
    /**
     * Endpoint para descargar en formato csv
     * "attachment" indica al navegador que es un archivo adjunto descargable
     * @return
     */
    @GetMapping("/getCsv")
    public ResponseEntity<byte[]> dowloandCsvFile(){
        String data = service.getCsvFormat();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType("text/csv"));//Interpreta el contenido recibido
        httpHeaders.setContentDispositionFormData("attachment", "randomUser.csv");
        return new ResponseEntity<>(data.getBytes(), httpHeaders ,HttpStatus.OK);
    }
    /**
     * Endpoint para descargar en formato xml
     * "attachment" indica al navegador que es un archivo adjunto descargable
     * @return
     */
    @GetMapping("/getXml")
    public ResponseEntity<byte[]> dowloandXmlFile(){
        String data = service.getXmlFormat();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType("text/xml"));//Interpreta el contenido recibido
        httpHeaders.setContentDispositionFormData("attachment", "randomUser.xml");
        return new ResponseEntity<>(data.getBytes(), httpHeaders ,HttpStatus.OK);
    }



    /**
     * Si no se quiere usar un ResponseEntity para getUser
     */
    /*
    @GetMapping("/randomuser")
    public Root getRandomUser() {
        return userService.getRandomUser();
    }
     */

}
