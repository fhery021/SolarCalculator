package com.solar.solarcalculator.offer.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SolarPanel {

    @Id
    Long id;

    /**
     * Code of the solar panel
     */
    String code;

    /**
     * Manufacturer's name
     */
    String manufacturer;

    /**
     * Wp Power
     */
    Integer power;

    /**
     * Voc
     */
    Float voc;

    /**
     * Isc
     */
    Float isc;

    /**
     * Vmppt
     */
    Float vmppt;

    /**
     * Immpt
     */
    Float immpt;

    /**
     * Voc Coefficient
     */
    Float coefVoc;

    /**
     * Width of the solar panel
     */
    Float panelWidth;

    /**
     * Length of the solar panel
     */
    Float panelLength;

    /**
     * Weight of the solar panel
     */
    Float panelWeight;
}
