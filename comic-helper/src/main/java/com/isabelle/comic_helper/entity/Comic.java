package com.isabelle.comic_helper.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comicId;
    private String comicName;
    private Date dateCreation;
    private Long comicVolume;

    public Comic() {
        super();
    }

    public Comic(String comicName, Long comicVolume) {
        super();
        this.comicName = comicName;
        this.comicVolume = comicVolume;
    }

    public Long getComicId() {
        return this.comicId;
    }

    public void setComicId(Long comicId) {
        this.comicId = comicId;
    }

    public String getComicName() {
        return this.comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getComicVolume() {
        return this.comicVolume;
    }

    public void setComicVolume(Long comicVolume) {
        this.comicVolume = comicVolume;
    }

    @Override
    public String toString() {
        return 
            "Comic [comicId=" + getComicId() + ", comicName=" + getComicName() + ", comicVolume=" + getComicVolume() + "]";           
    }
}
