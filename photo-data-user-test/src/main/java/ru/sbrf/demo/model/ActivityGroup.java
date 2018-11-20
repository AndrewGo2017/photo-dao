package ru.sbrf.demo.model;

public class ActivityGroup extends BaseEntity {
    private String name;

    private Boolean isActive;

    public ActivityGroup(Long id, String name, Boolean isActive) {
        super(id);
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isBold) {
        this.isActive = isBold == null ? false : isBold;
    }
}
