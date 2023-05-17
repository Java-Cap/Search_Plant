package com.example.project.entity;

import com.example.project.constants.Barrel;
import com.example.project.constants.Crown;
import com.example.project.constants.Flower;
import com.example.project.constants.Fruit;
import com.example.project.constants.Leaf;

import java.io.Serializable;
import java.util.Objects;

public class Plant implements Serializable {

    private Integer id;
    private String  title;
    private Barrel  barrel;
    private Leaf    leaf;
    private Flower  flower;
    private Fruit   fruit;
    private Crown   crown;
    private String  picture;
    private String  description;

    public Plant() {
        this(null, null, null, null, null, null, null);
    }

    public Plant(String title, Barrel barrel, Leaf leaf, Flower flower, Fruit fruit, Crown crown, String picture) {
        this(null, title, barrel, leaf, flower, fruit, crown, picture, null);
    }

    public Plant(Integer id, String title, Barrel barrel, Leaf leaf, Flower flower, Fruit fruit, Crown crown, String picture, String description) {
        this.id = id;
        this.title = title;
        this.barrel = barrel;
        this.leaf = leaf;
        this.flower = flower;
        this.fruit = fruit;
        this.crown = crown;
        this.picture = picture;
        this.description = description;
    }

    public Integer getId()          { return id;          }
    public String  getTitle()       { return title;       }
    public Barrel  getBarrel()      { return barrel;      }
    public Leaf    getLeaf()        { return leaf;        }
    public Flower  getFlower()      { return flower;      }
    public Fruit   getFruit()       { return fruit;       }
    public Crown   getCrown()       { return crown;       }
    public String  getPicture()     { return picture;     }
    public String  getDescription() { return description; }

    public void setId           (Integer id)            { this.id = id;                  }
    public void setTitle        (String title)          { this.title = title;            }
    public void setBarrel       (Barrel barrel)         { this.barrel = barrel;          }
    public void setLeaf         (Leaf leaf)             { this.leaf = leaf;              }
    public void setFlower       (Flower flower)         { this.flower = flower;          }
    public void setFruit        (Fruit fruit)           { this.fruit = fruit;            }
    public void setCrown        (Crown crown)           { this.crown = crown;            }
    public void setPicture      (String picture)        { this.picture = picture;        }
    public void setDescription  (String description)    {this.description = description; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        Plant plant = (Plant) o;
        return barrel == plant.barrel && leaf == plant.leaf && flower == plant.flower && fruit == plant.fruit && crown == plant.crown;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barrel, leaf, flower, fruit, crown);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", barrel=" + barrel +
                ", leaf=" + leaf +
                ", flower=" + flower +
                ", fruit=" + fruit +
                ", crown=" + crown +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}