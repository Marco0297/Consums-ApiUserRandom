package com.randomuser.randomuser.dto;

import lombok.Data;

import java.util.List;

/**
 * La anotacion @Data trae consigo varias anotaciones como son
 * @Setters
 * @Getters
 * @RequiredArgsConstructor
 * @ToString
 */
@Data
public class RootDto  {
    private List<ResultDto> results;
    private InfoDto info;


}
