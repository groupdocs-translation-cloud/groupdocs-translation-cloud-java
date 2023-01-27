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
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.out;


public class Demo {


    private static String translateText() {
        TextInfo textInfo = new TextInfo("en-fr", "London is the capital and largest city of England and the United Kingdom.");
        ArrayList<TextInfo> textInfoList = new ArrayList<TextInfo>();
        textInfoList.add(textInfo);
        String userRequest = textInfoList.toString();
        TranslationTextRequest translationTextRequest = new TranslationTextRequest(userRequest);
        TranslationTextResponse translateTextResponse = null;
        try {
            translateTextResponse = TranslationApi.TranslateText(translationTextRequest);
            out.println(translateTextResponse.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return translateTextResponse.translation;
    }


    private static String TranslateDocument()
    {
        String name = "hugo_test_file.md";
        String upload_name = "hugo_test_file.md";
        String folder = "";
        String pair = "en-fr";
        String format = "hugo";
        String storage = "";
        String saveFile = "translated_hugo_test_file.md";
        String savePath = "";
        Boolean masters =  false;
        String separator = ",";
        ArrayList<Integer> elements = new ArrayList<>();
        String outformat = "hugo";
        HashMap<String, ArrayList<String>> codelist = new HashMap<>();
        codelist.put("0", new ArrayList<String>(Arrays.asList("1", "3")));
        HashMap<Integer, ArrayList<ArrayList<String>>> frontlists = new HashMap<>();
        ArrayList<ArrayList<String>> front = new ArrayList<>();
        front.add(new ArrayList<>(Arrays.asList("title")));
        front.add(new ArrayList<>(Arrays.asList("frontmatter", "title")));
        front.add(new ArrayList<>(Arrays.asList("frontmatter", "description")));
        frontlists.put(0, front);
        boolean optimizepdffontsize = false;

        try {
            out.println("Uploading file");
            uploadFile(new File(upload_name), storage);
            out.println("File uploaded");
        } catch (IOException e) {
            out.println("Failed to upload file");
            e.printStackTrace();
        }


        FileInfo fileInfo = new FileInfo(pair, format, outformat, storage, name, folder, savePath, saveFile, masters,
                elements, separator, codelist, frontlists, optimizepdffontsize);
        out.println(fileInfo.toString());
        TranslationDocumentRequest translationDocumentRequest = new TranslationDocumentRequest(fileInfo.toString());
        TranslateDocumentResponse translateDocumentResponse = null;
        try {
            out.println("Start to translate");
            translateDocumentResponse = TranslationApi.TranslateDocument(translationDocumentRequest);
            out.println("Translated file");
        } catch (IOException e) {
            out.println("Failed to translate");
            e.printStackTrace();
        }
        out.println(translateDocumentResponse.status);

        try {
            out.println("Downloading file");
            out.println(downloadFile(saveFile, savePath, storage));
            out.println("File downloaded");
        } catch (IOException e) {
            out.println("Failed to download file");
            e.printStackTrace();
        }
        return translateDocumentResponse.message;
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

    private static ParseHugoResponse HugoParsing(){
        String name = "hugo_test_file.md";
        String folder = "";
        String storage = "";
        HugoInfo hugoInfo = new HugoInfo(name, folder, storage);
        ParseHugoRequest hugoRequest = new ParseHugoRequest(hugoInfo.toString());
        ParseHugoResponse hugoResponse = null;
        try {
            out.println("Start to parse");
            hugoResponse = TranslationApi.ParseHugo(hugoRequest);
            out.println("Parse file");
        } catch (IOException e) {
            out.println("Failed to parse");
            e.printStackTrace();
        }
        return hugoResponse;
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

        ParseHugoResponse newResponse;
        newResponse = HugoParsing();
        out.println(newResponse.status);
        out.println(newResponse.message);
        out.println(newResponse.shortcode);
        out.println(newResponse.frontlists);
    }
//
    //Helper class to upload file to Aspose Storage for RecognizeFromStorage requests
    private static void uploadFile(File f, String uploadFolder)  throws IOException
    {
        RequestBody requestBody = RequestBody.create( MediaType.parse("multipart/form-data"), f);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

        String path = (uploadFolder == null || uploadFolder.isEmpty()) ? f.getName() : uploadFolder + File.separator + f.getName();

        // Post document to storage
        StorageApi storageApi = new ApiClient().createService(StorageApi.class);
        Call<FilesUploadResult> call = storageApi.uploadFile(path, fileToUpload, null);

        Response<FilesUploadResult> res = call.execute();
    }

    private static void setUpConfig() throws Exception {
        Configuration.setClient_id("translate.app");
        Configuration.setClient_secret("493684a32e1871649cbd48e122eed6ec");

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

    public static boolean downloadFile(String fileName, String uploadFolder, String storage)  throws IOException {

        StorageApi storageApi = new ApiClient().createService(StorageApi.class);
        String path = (uploadFolder == null || uploadFolder.isEmpty()) ? fileName : uploadFolder + File.separator + fileName;
        Call<ResponseBody> call_download = storageApi.downloadFile(path, storage, null);

        Response<ResponseBody> res = call_download.execute();
        ResponseBody res_download = res.body();
        return saveToDisc(res_download, path);
    }

    public static boolean saveToDisc(ResponseBody body, String fileName) {

        File f = null;
        try {
            f = new File("", fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        try (InputStream inputStream = body.byteStream();
             OutputStream outputStream = new FileOutputStream(f)
        ) {

            byte[] fileReader = new byte[4096];

            while (true) {
                int read = inputStream.read(fileReader);
                if (read == -1) {
                    break;
                }

                outputStream.write(fileReader, 0, read);
            }

            outputStream.flush();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
