////package com.groupdocs;
////// Import classes:
////
////import com.groupdocs.model.*;
////import org.openapitools.client.api.TranslationApi;
////
////import java.io.IOException;
////import java.nio.file.Files;
////import java.nio.file.Paths;
////
////public class Demo {
////    public static void main(String[] args) {
////        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
////        String cliendId = "translate.cloud";
////        String clientSecret = "5d0da472782620373473703904631795";
////
////        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
////        TranslationApi translationApi = new TranslationApi(defaultClient);
////
////        FileRequest fileRequest = new FileRequest();
////
////        String fileName = "Blueberries.docx";
////        fileRequest.setSourceLanguage("en");
////        fileRequest.addTargetLanguagesItem("zh");
////        fileRequest.setFormat(FileRequest.FormatEnum.DOCX);
////        fileRequest.setSavingMode(FileRequest.SavingModeEnum.FILES);
////        fileRequest.setOutputFormat("docx");
////        fileRequest.setUrl("");
////        fileRequest.setOrigin("");
////
////        try {
////            byte[] fileByte = Files.readAllBytes(Paths.get(fileName));
////            fileRequest.setFile(fileByte);
////            StatusResponse response = translationApi.autoPost(fileRequest);
////            String _id = response.getId();
////            if (!response.getStatus().toString().equals("500")) {
////                while (true) {
////                    CloudFileResponse textResponse = translationApi.documentRequestIdGet(_id);
////                    System.out.println(textResponse);
////                    if (textResponse.getStatus().toString().equals("200")){
////                        System.out.println(textResponse);
////                        break;
////                    }
////                    try {
////                        Thread.sleep(2000);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                }
////            }
////        }
////        catch(ApiException e){
////            System.err.println("Exception when calling TranslationApi#pdfPost");
////            System.err.println("Status code: " + e.getCode());
////            System.err.println("Reason: " + e.getResponseBody());
////            System.err.println("Response headers: " + e.getResponseHeaders());
////            e.printStackTrace();
////        }
////        catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////}
//
//
package com.groupdocs;
// Import classes:

import com.groupdocs.model.*;
import org.openapitools.client.api.FileApi;
import org.openapitools.client.api.TranslationApi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
        String cliendId = "translate.cloud";
        String clientSecret = "5d0da472782620373473703904631795";

        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        TranslationApi translationApi = new TranslationApi(defaultClient);


        FileApi fileApi = new FileApi(defaultClient);


        String fileName = "files_for_test/TED_Judson_Brewer.mp3";
        File fileToTranslate = new File(fileName);

        try {
            String file_url = fileApi.fileUploadPost("mp3", fileToTranslate);
//            String file_url = "https://translation-groupdocs-app.s3.us-west-2.amazonaws.com/09b6d9fa-80a7-47f2-a311-76f5510a6020.DOCX?X-Amz-Expires=86400&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIA4XIV7DNDNXDH3NXK/20241125/us-west-2/s3/aws4_request&X-Amz-Date=20241125T123218Z&X-Amz-SignedHeaders=host&X-Amz-Signature=6de35f00c05043c4d43ba7289f638910d1192cc8b73dc7be1d2a281e0445094a";
            System.out.println(file_url);

            MediaToTextRequest fileRequest = new MediaToTextRequest();

            fileRequest.setSourceLanguage("en");
            fileRequest.addTargetLanguagesItem("de");
            fileRequest.setFormat(MediaToTextRequest.FormatEnum.MP3);
//            fileRequest.setOutputFormat("xlsx");
//            fileRequest.setSavingMode(SpreadsheetFileRequest.SavingModeEnum.FILES);
            fileRequest.setUrl(file_url);
            fileRequest.setOrigin("");
//            fileRequest.setSource("en");
//            fileRequest.addTargetsItem("fr");
//            ArrayList<String> frag = new ArrayList<>();
//            frag.add("0-0");
//            fileRequest.setFragments(frag);

            try {
                StatusResponse response = translationApi.mediaToTextPost(fileRequest);
                String _id = response.getId();
                System.out.println(_id);
                if (!response.getStatus().toString().equals("500")) {
                    while (true) {
                        CloudFileResponse fileResponse = translationApi.documentRequestIdGet(_id);
                        if (fileResponse.getStatus().toString().equals("200")){
                            System.out.println(fileResponse);
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
                System.err.println("Exception when calling TranslationApi#documentPost");
                System.err.println("Status code: " + e.getCode());
                System.err.println("Reason: " + e.getResponseBody());
                System.err.println("Response headers: " + e.getResponseHeaders());
                e.printStackTrace();
            }
        }
        catch(Exception e){
            System.err.println("Exception when calling FileApi#fileUploadPost");
            e.printStackTrace();
        }
    }
}

//package com.groupdocs;
//// Import classes:
//
//import com.groupdocs.model.*;
//import org.openapitools.client.api.TranslationApi;
//
//public class Demo {
//    public static void main(String[] args) {
//        String basePath = "https://api.groupdocs.cloud/v2.0/translation";
//        String cliendId = "translate.cloud";
//        String clientSecret = "5d0da472782620373473703904631795";
//
//        ApiClient defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
//        TranslationApi translationApi = new TranslationApi(defaultClient);
//
//        TextRequest request = new TextRequest();
//
//        request.setSourceLanguage("en");
//        request.addTargetLanguagesItem("fr");
//        request.addTargetLanguagesItem("th");
//        request.addTextsItem("Text to translate");
//        request.setOrigin("");
//
//        try {
//            String r = translationApi.textPost(request).getId();
//            System.out.println(r);
//            CloudTextResponse response = translationApi.textRequestIdGet(r);
//            if (!response.getStatus().toString().equals("500")) {
//                while (true) {
//                    response = translationApi.textRequestIdGet(r);
//                    if (response.getStatus().toString().equals("200")) {
//                        System.out.println(response);
//                        break;
//
//                    }
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        }
//        catch(ApiException e){
//            System.err.println("Exception when calling TranslationApi#textPost");
//            System.err.println("Status code: " + e.getCode());
//            System.err.println("Reason: " + e.getResponseBody());
//            System.err.println("Response headers: " + e.getResponseHeaders());
//            e.printStackTrace();
//        }
//    }
//}































