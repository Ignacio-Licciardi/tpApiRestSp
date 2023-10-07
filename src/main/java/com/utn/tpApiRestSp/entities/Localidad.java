package com.utn.tpApiRestSp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Table(name ="localidad")
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
