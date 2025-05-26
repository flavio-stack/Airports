/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.flavio.airports.projections;

//import local.flavio.airports.DTO.AirportNearMeDTO;
//import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author ppjata
 */
public interface AirportNearMeProjection {
    
    long getId();
    String getName();
    String getCity();
    String getIataCode();
    double getLatitude();
    double getLongitude();
    double getAltitude();
    double getDistanciaKM();

  
         
}

