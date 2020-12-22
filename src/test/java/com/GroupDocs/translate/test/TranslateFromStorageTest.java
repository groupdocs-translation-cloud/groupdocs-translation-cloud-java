/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TranslateFromStorageTest.java">
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


package com.GroupDocs.translate.test;

import com.GroupDocs.translate.ApiClient;
import com.GroupDocs.translate.api.FileInfo;
import com.GroupDocs.translate.api.TranslateApiInvoker;

import com.GroupDocs.translate.api.TranslationDocumentRequest;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class TranslateFromStorageTest extends BaseTest {

    private String fileName;
    private String folder;
    private String storage;
    private static TranslateApiInvoker api = new ApiClient().createService(TranslateApiInvoker.class);
    private static final Gson gson = new Gson();

    //Constructor that takes test data.
    public TranslateFromStorageTest(
            String fileName
    ) throws Exception {
        super();
        this.fileName = fileName;
        this.folder = "";
        this.storage = null;
    }


    @Before
    public void initialize() {
        api = new ApiClient().createService(TranslateApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]
            {
                {"testTranslate.doc"},
            });
    }

    @Test(timeout = 200000)
    public void TranslateFromStorage() {
        out.println("Test file: " + fileName);
        try {
            TestHelper.uploadFile(fileName, folder);
            String pair = "en-fr";
            String format = "doc";
            String savePath = folder + "/translated";
            String saveFile = "translated-" + fileName;
            Boolean masters = false;
            ArrayList<Integer> elements = null;
            String outformat = null;
            FileInfo fileInfo = new FileInfo(fileName, folder, storage, format, savePath, saveFile, pair, masters, elements, outformat);
            TranslationDocumentRequest translationDocumentRequest = new TranslationDocumentRequest(fileInfo.toString());
            String translationDocumentRequestJson = gson.toJson(translationDocumentRequest.getUserRequest());
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), translationDocumentRequestJson);
            Call<ResponseBody> call = api.TranslateFromDocument(requestBody);

             Response<ResponseBody> res = call.execute();
             assertTrue(res.isSuccessful());

             ResponseBody answer = res.body();
             assertNotNull("Answer is null, ", answer);

             String text = answer.string();
             assertNotNull("Text is empty" + res.toString(), text);

             out.println(text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
