package com.GroupDocs.translate.test;

import com.GroupDocs.translate.Configuration;

import static java.lang.System.out;

public class BaseTest {

    BaseTest() throws Exception {
        //Todo: Setup App_SID & App_Key; You can get them in your Aspose Dashboard https://dashboard.aspose.cloud

        Configuration.setClient_id("");
        Configuration.setClient_secret("");

        Configuration.setAuthPath("https://api.groupdocs.cloud/connect/token");
        Configuration.setBasePath("https://api.groupdocs.cloud/v1.0");

        Configuration.setUserAgent("WebKit");
        Configuration.setDebug(true);
        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getClient_id().isEmpty() || Configuration.getClient_secret().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }
}
