package com.saiful.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParsedResult {

@SerializedName("TextOverlay")
@Expose
public TextOverlay textOverlay;
@SerializedName("TextOrientation")
@Expose
public String textOrientation;
@SerializedName("FileParseExitCode")
@Expose
public Integer fileParseExitCode;
@SerializedName("ParsedText")
@Expose
public String parsedText;
@SerializedName("ErrorMessage")
@Expose
public String errorMessage;
@SerializedName("ErrorDetails")
@Expose
public String errorDetails;

}