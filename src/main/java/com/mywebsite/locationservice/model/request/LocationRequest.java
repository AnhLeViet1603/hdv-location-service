package com.mywebsite.locationservice.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LocationRequest {
    Long driverId;
    Long vehicleTypeId;
    Double lat;
    Double lng;
    Long timestamp;
    String status;
}
