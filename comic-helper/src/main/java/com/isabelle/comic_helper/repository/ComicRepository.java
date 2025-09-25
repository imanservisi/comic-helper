package com.isabelle.comic_helper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelle.comic_helper.entity.Comic;

public interface ComicRepository extends JpaRepository<Comic, Long> {

}
