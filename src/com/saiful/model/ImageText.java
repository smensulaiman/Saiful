package com.saiful.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ImageText {
@SerializedName("ParsedResults")
@Expose
public List<ParsedResult> parsedResults = null;
@SerializedName("OCRExitCode")
@Expose
public Integer oCRExitCode;
@SerializedName("IsErroredOnProcessing")
@Expose
public Boolean isErroredOnProcessing;
@SerializedName("ProcessingTimeInMilliseconds")
@Expose
public String processingTimeInMilliseconds;
@SerializedName("SearchablePDFURL")
@Expose
public String searchablePDFURL;
    
}
