package com.saiful.ocr;

import com.google.gson.Gson;
import com.saiful.model.ImageText;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;

import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class APIClient {

    public String getTextFromImage(File file) throws Exception {

        //File file = new File(image);
        ContentBody cbFile = new FileBody(file);

        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://api.ocr.space/Parse/Image");

        MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        mpEntity.addPart("apikey", new StringBody("7caa285efb88957"));
        mpEntity.addPart("image", cbFile);
        mpEntity.addPart("language", new StringBody("eng"));
        mpEntity.addPart("OCREngine", new StringBody("2"));

        httppost.setEntity(mpEntity);

        HttpResponse response = httpclient.execute(httppost);

        HttpEntity entity = response.getEntity();
        Header encodingHeader = entity.getContentEncoding();
        Charset encoding = encodingHeader == null ? StandardCharsets.UTF_8
                : Charsets.toCharset(encodingHeader.getValue());
        String json = EntityUtils.toString(entity, StandardCharsets.UTF_8);

        Gson gson = new Gson();

        ImageText text = gson.fromJson(json, ImageText.class);
        String nidText = text.parsedResults.get(0).parsedText;
        if (nidText != null) {
            if (nidText.contains("Gender")) {
                String[] formatText = nidText.split("Gender");
                if (formatText.length > 1) {
                    return formatText[1];
                }
            }
        }
        return "error";
    }
}
