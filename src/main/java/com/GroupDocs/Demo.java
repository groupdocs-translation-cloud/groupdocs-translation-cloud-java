/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Demo.java">
 *   Copyright (c) 2020 GroupDocs.Translation for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */


package com.GroupDocs;

import com.GroupDocs.storage.api.StorageApi;
import com.GroupDocs.storage.model.FilesUploadResult;
import com.GroupDocs.translate.ApiClient;
import com.GroupDocs.translate.Configuration;
import com.GroupDocs.translate.api.*;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;


public class Demo {

    private static String translateText() {
        TextInfo textInfo = new TextInfo("fr-de", "Bon jour /n Comment êtes-vous?");
        ArrayList<TextInfo> textInfoList = new ArrayList<TextInfo>();
        textInfoList.add(textInfo);
        String userRequest = textInfoList.toString();
        TranslationTextRequest translationTextRequest = new TranslationTextRequest(userRequest);
        TranslationTextResponse translateTextResponse = null;
        try {
            translateTextResponse = TranslationApi.TranslateText(translationTextRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return translateTextResponse.translation;
    }


    private static String TranslateDocument()
    {
        String name = "test.docx";
        String folder = "test";
        String pair = "en-fr";
        String format = "docx";
        String storage = "First Storage";
        String saveFile = "translated.docx";
        String savePath = "";
        Boolean masters =  false;
        ArrayList<Integer> elements = null;
        String outformat = null;
        try {
            uploadFile(name, folder, storage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInfo fileInfo = new FileInfo(name, folder, storage, format, savePath, saveFile, pair, masters, elements, outformat);
        TranslationDocumentRequest translationDocumentRequest = new TranslationDocumentRequest(fileInfo.toString());
        TranslateDocumentResponse translateTextResponse = null;
        try {
            translateTextResponse = TranslationApi.TranslateDocument(translationDocumentRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return translateTextResponse.message;
    }


    private static String healthCheck() {
        TranslationTextResponse translateTextResponse = null;
        try {
            translateTextResponse = TranslationApi.RunHealthCheck();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return translateTextResponse.message;

    }
//
//
//
    public static void main(String... args) throws Exception {
        out.println("Warning: Some consoles doesn't support unicode symbols.");

        setUpConfig();
        String text;

        // SDK usage examples

        text = translateText();
        out.println(text);

        text = healthCheck();
        out.println(text);

        text = TranslateDocument();
        out.println(text);

    }
//
//    //Helper class to upload file to Aspose Storage for RecognizeFromStorage requests
//    private static void uploadFile(File f, String uploadFolder)  throws IOException
//    {
//        RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
//        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);
//
//        String path = (uploadFolder == null || uploadFolder.isEmpty()) ? f.getName() : uploadFolder + File.separator + f.getName();
//
//        // Post document to storage
//        StorageApi storageApi = new ApiClient().createService(StorageApi.class);
//        Call<FilesUploadResult> call = storageApi.uploadFile(path, fileToUpload, null);
//
//        Response<FilesUploadResult> res = call.execute();
//    }
//
    private static void setUpConfig() throws Exception {
        Configuration.setClient_id("");
        Configuration.setClient_secret("");

        Configuration.setAuthPath("https://api.groupdocs.cloud/connect/token");
        Configuration.setBasePath("https://api.groupdocs.cloud/v1.0");

        Configuration.setUserAgent("WebKit");

        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getClient_secret().isEmpty() || Configuration.getClient_id().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }

    public static boolean uploadFile(String fileName, String uploadFolder, String storage)  throws IOException {

        File f = new File(Configuration.getTestSrcDir(), fileName);

        if(!f.exists()) {
            System.out.println("file not found");
            throw new RuntimeException("File not found");
        }

        RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

        String path = (uploadFolder == null || uploadFolder.isEmpty()) ? fileName : uploadFolder + File.separator + fileName;

        StorageApi storageApi = new ApiClient().createService(StorageApi.class);
        // Post document to storage
        Call<FilesUploadResult> call = storageApi.uploadFile(path, fileToUpload, null);

        Response<FilesUploadResult> res = call.execute();

        return true;
    }

}
