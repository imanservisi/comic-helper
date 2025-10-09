package com.isabelle.comic_helper.entity;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comicId;
    
    @NonNull
    private String comicName;
    
    private LocalDateTime dateCreation;
    
    @NonNull
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

    public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
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
