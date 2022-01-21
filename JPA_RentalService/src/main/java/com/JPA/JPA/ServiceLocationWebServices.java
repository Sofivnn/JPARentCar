package com.JPA.JPA;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceLocationWebServices {

    PersonRepository personRepository;
    VehiculeRepository vehiculeRepository;
    RentRepository rentRepository;

    public ServiceLocationWebServices(PersonRepository personRepository, VehiculeRepository vehiculeRepository, RentRepository rentRepository){
        this.personRepository = personRepository;
        this.vehiculeRepository = vehiculeRepository;
        this.rentRepository = rentRepository;
    }


   @GetMapping(value = "/persons")
   @ResponseStatus(HttpStatus.OK)
   @ResponseBody
    public Iterable<Person> listOfPerson(){
        return personRepository.findAll();
    }


    @GetMapping(value = "/vehicule")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Vehicule> listOfVehicule(){
        return vehiculeRepository.findAll();
    }

    @GetMapping(value = "/rent")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Rent> listOfRent(){
        return rentRepository.findAll();
    }

    @GetMapping("/rent/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Rent getRent(@PathVariable(value = "id") long id){
        for(Rent rent: rentRepository.findAll()){
            if(rent.getId()==id){
                return rent;
            }
        }
        return null;
    }


        @GetMapping("/cars/{plateNumber}")
    public Vehicule getCar(@PathVariable(value = "plateNumber") String plateNumber){
        for(Vehicule car: vehiculeRepository.findAll()){
            if(car.getPlateNumber().equals(plateNumber)){
                return car;
            }
        }
        return null;
    }


}
