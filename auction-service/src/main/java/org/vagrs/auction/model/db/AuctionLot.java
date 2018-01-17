package org.vagrs.auction.model.db;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kirill Zhitelev on 09.01.2018.
 */
@Entity
@Table(name = "auction_lots")
public class AuctionLot {
    @Id
    @Column(name = "lot_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lot_name")
    private String lotName;

    @Column(name = "lot_description")
    private String lotDesc;

    @Column(name = "start_bid")
    private Integer startBid;

    @Column(name = "current_bid")
    private Integer currentBid;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "price")
    private Integer price;

    @Column(name = "duration")
    private String duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotDesc() {
        return lotDesc;
    }

    public void setLotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
    }

    public Integer getStartBid() {
        return startBid;
    }

    public void setStartBid(Integer startBid) {
        this.startBid = startBid;
    }

    public Integer getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(Integer currentBid) {
        this.currentBid = currentBid;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
