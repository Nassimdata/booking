package com.infoway.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@ToString
public class Furniture {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;


    @Column
    private Integer zipCode;

    @Column
    private Integer totalSmallFurnitures;

    @Column
    private Integer totalMediumFurnitures;

    @Column
    private Integer totalLargeFurnitures;

    @Column
    private String address;

    @Column
    private String mobile;

    private String status;




}
