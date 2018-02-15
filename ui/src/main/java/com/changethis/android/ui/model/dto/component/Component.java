package com.changethis.android.ui.model.dto.component;

import com.changethis.android.ui.model.dto.component.style.ViewComponentParams;

import java.util.List;

/**
 * Created by mgigena on 7/2/18.
 */

public class Component {

    private final int id;
    private final String type;
    private final ViewComponentParams componentParams;
    private final ComponentTextContents textContents;
    private final List<SubComponent> subComponents;
    private final List<Constraint> constraints;

    public Component(int id, String type, ViewComponentParams componentParams, ComponentTextContents textContents, List<SubComponent> subComponents, List<Constraint> constraints) {
        this.id = id;
        this.type = type;
        this.componentParams = componentParams;
        this.textContents = textContents;
        this.subComponents = subComponents;
        this.constraints = constraints;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public ViewComponentParams getComponentParams() {
        return componentParams;
    }

    public ComponentTextContents getTextContents() {
        return textContents;
    }

    public List<SubComponent> getSubComponents() {
        return subComponents;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", componentParams=" + componentParams +
                ", textContents=" + textContents +
                ", subComponents=" + subComponents +
                ", constraints=" + constraints +
                '}';
    }
}
