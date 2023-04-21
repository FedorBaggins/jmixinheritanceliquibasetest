package com.company.jmixinheritanceliquibasetest.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@JmixEntity
@Entity
public class FirstEntity extends AbstractEntity {
    @Column(name = "FIRST_STRING")
    private String firstString;

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }
}