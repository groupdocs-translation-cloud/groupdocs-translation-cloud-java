package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.TranslationApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {
        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        TranslationApi translationApi = new TranslationApi(defaultClient);

        FileRequest fileRequest = new FileRequest();

        String fileName = "Blueberries.docx";
        fileRequest.setSourceLanguage("en");
        fileRequest.addTargetLanguagesItem("ru");
        fileRequest.setFormat(FileRequest.FormatEnum.DOCX);
        fileRequest.setSavingMode(FileRequest.SavingModeEnum.FILES);
        fileRequest.setOutputFormat("docx");
        fileRequest.setUrl("");
        fileRequest.setOrigin("");

        try {
            byte[] fileByte = Files.readAllBytes(Paths.get(fileName));
            fileRequest.setFile(fileByte);
            StatusResponse response = translationApi.autoPost(fileRequest);
            String _id = response.getId();
            if (!response.getStatus().toString().equals("500")) {
                while (true) {
                    CloudFileResponse textResponse = translationApi.documentRequestIdGet(_id);
                    System.out.println(textResponse);
                    if (textResponse.getStatus().toString().equals("200")){
                        System.out.println(textResponse);
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch(ApiException e){
            System.err.println("Exception when calling TranslationApi#pdfPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}



