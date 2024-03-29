package com.course.platform.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_section")
public class Section implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
@ManyToOne
@JoinColumn(name = "prerequisite_id")
    private Section prerequesite;

    public Section() {
    }

    public Section(Long id, String title, String description, Integer position, String imgUri, Resource resource, Section prerequesite) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.resource = resource;
        this.prerequesite = prerequesite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Section getPrerequesite() {
        return prerequesite;
    }

    public void setPrerequesite(Section prerequesite) {
        this.prerequesite = prerequesite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(id, section.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


