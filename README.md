# GroupDocs.Translation Cloud

[GroupDocs.Translation Cloud](https://products.groupdocs.cloud/translation) is Cloud API to translate Word and Excel files as well as plain text. 

For convenience of our Java customers we introduce a simple SDK used to add translation of Microsoft Word documents, Microsoft Excel workbooks and plain text to your app with merely a few lines of code.

In detail, it's a set of SDKs for document and plain text translation in our Cloud. It supports translaton of .doc, .docx, .docm, .xls, .xlsx, .xlsm files. Just pass a specific file or text to the GroupDocs.Translation Cloud API, and it will translate and save translated file in our Cloud or will return translated text.

It is easy to get started with GroupDocs.Translation Cloud, and there is nothing to install. Create an account at [GroupDocs Cloud](https://dashboard.groupdocs.cloud/#/) and get your application information, then you are ready to use [SDKs](https://github.com/groupdocs-translation-cloud)

## Release 20.08:
- GroupDocs.Translation Java SDK

    
## Features:
- Translation of Microsoft Word and Microsoft Excel documents
- [10 languages and 18 languages pairs support](https://docs.groupdocs.cloud/translation/supported-languages/)
- Translation of tables, headers, footers, footnotes / endnotes, image captions in Word documents
- Translation of cells, charts, tables, pivot tables in Excel documents
- Translation of plain text
- API that allows you manage your files and folders in our Cloud

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we have provided and support [SDKs](https://github.com/groupdocs-translation-cloud) in many development languages to make it easier to integrate with us.

## Example
```java
import com.GroupDocs.translate.api.*;
import com.GroupDocs.translate.Configuration;


private static void setUpConfig() throws Exception {
    Configuration.setAPP_SID("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX");
    Configuration.setAPI_KEY("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

public String TranslateDocument() {
    String name = "test.docx";
    String folder = "";
    String pair = "en-fr";
    String format = "docx";
    String storage = "First Storage";
    String saveFile = "translation.docx";
    String savePath = "";
    FileInfo fileInfo = new FileInfo(name, folder, pair, format, storage, saveFile, savePath);
    TranslationDocumentRequest translationDocumentRequest = new TranslationDocumentRequest(fileInfo.toString());
    TranslateDocumentResponse translateDocumentResponse = TranslationApi.TranslateDocument(translationDocumentRequest)
    return translateDocumentResponse.message;
}

static String TranslateText() {
    pair = "en-fr";
    text = "Text to translate";
    TextInfo textInfo = new TextInfo(pair, text);
    TranslationTextRequest translationTextRequest = new TranslationTextRequest(TextInfo.toString());
    TranslationTextResponse translateTextResponse = TranslationApi.TranslateText(translationTextRequest);
    return translateTextResponse.translation;
}
```
_________________________

## Quickstart

Make your solution using [SDK](https://github.com/groupdocs-translation-cloud), follow these steps:

#### 1. Get API keys if you haven't

Make a personal account on [GroupDocs Cloud Dashboard](https://dashboard.groupdocs.cloud/#/) and click _Get Keys_. These keys are useful for all GroupDocs Cloud products. If you have any trouble, look at this [detailed manual](https://docs.groupdocs.cloud/translation/create-new-app-and-get-app-key-and-sid/).

#### 2. Run Demo
  * Checkout the SDK
  * Set Your AppSid & AppKey
  * Run Java console Demo
  * We recommend using JDK 13 to work with SDK

_________________________

## SDK Detailes:

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.GroupDocs</groupId>
    <artifactId>GroupDocs-translation-cloud</artifactId>
    <version>20.8.0</version>
    <scope>compile</scope>
</dependency>
<repositories>
   <repository>
        <id>GroupDocsJavaAPI</id>
        <name>GroupDocs Java API</name>
        <url>https://repository.groupdocs.cloud/repo/</url>
    </repository>
</repositories>            
```
### Dependencies
[See build.gradle](./build.gradle#L27)

## GroupDocs.Translation Cloud SDKs

||||||||||
|--------------|----------|-------|-------|-------|---------|---------|----------|-------|
|[.NET](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet)|[Java](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-java)|PHP|Ruby|[Python](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-python)|Node.js|Android|Objective-C|Perl|

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/translation/java) | [Docs](https://docs.groupdocs.cloud/translation/) | [Demos](https://products.groupdocs.app/viewer/family) | [API Reference](https://apireference.groupdocs.cloud/translation/) | [Examples](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/translation/) | [Free Support](https://forum.groupdocs.cloud/c/translation) | [Free Trial](https://purchase.groupdocs.cloud/trial)
