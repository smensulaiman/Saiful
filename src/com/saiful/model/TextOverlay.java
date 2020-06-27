package com.saiful.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TextOverlay {

@SerializedName("Lines")
@Expose
public List<Object> lines = null;
@SerializedName("HasOverlay")
@Expose
public Boolean hasOverlay;
@SerializedName("Message")
@Expose
public String message;

}