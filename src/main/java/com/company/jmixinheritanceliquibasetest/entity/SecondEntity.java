package com.company.jmixinheritanceliquibasetest.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@JmixEntity
@Entity
public class SecondEntity extends AbstractEntity {
    @Column(name = "SECOND_TEST_STRING")
    private String secondTestString;

    public String getSecondTestString() {
        return secondTestString;
    }

    public void setSecondTestString(String secondTestString) {
        this.secondTestString = secondTestString;
    }
}