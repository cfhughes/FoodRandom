package edu.cnm.deepdive.foodrandom.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import com.google.gson.annotations.Expose;

@Entity(
    foreignKeys = @ForeignKey(
        entity = edu.cnm.deepdive.foodrandom.model.entity.Nutrition.class,
        parentColumns = "id", childColumns = "recipes_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Nutrition {


  private String recipe_id;

  @Expose
  private String attribute;

  @Expose
  private double value;


}