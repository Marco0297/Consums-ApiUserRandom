package com.randomuser.randomuser.dto;

public class ResultDto {

    private String gender;
    private NameDto name;
    private LocationDto location;
    private String email;
    private LoginDto login;
    private DobDto dob;
    private RegisteredDto registered;
    private String phone;
    private String cell;
    private IdDto id;
    private PictureDto picture;
    private String nat;

    public ResultDto() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NameDto getName() {
        return name;
    }

    public void setName(NameDto name) {
        this.name = name;
    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DobDto getDob() {
        return dob;
    }

    public void setDob(DobDto dob) {
        this.dob = dob;
    }

    public RegisteredDto getRegistered() {
        return registered;
    }

    public void setRegistered(RegisteredDto registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public IdDto getId() {
        return id;
    }

    public void setId(IdDto id) {
        this.id = id;
    }

    public PictureDto getPicture() {
        return picture;
    }

    public void setPicture(PictureDto picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public LoginDto getLogin() {
        return login;
    }

    public void setLogin(LoginDto login) {
        this.login = login;
    }
}
