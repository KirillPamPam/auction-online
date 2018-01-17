package org.vagrs.auction.model.db;

import javax.persistence.*;

/**
 * Created by Kirill Zhitelev on 08.01.2018.
 */
@Entity
@Table(name = "categories")
public class Categorie {
    @Id
    @Column(name = "categorie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categorie_value")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
