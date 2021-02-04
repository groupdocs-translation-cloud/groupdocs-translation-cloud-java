![](https://img.shields.io/badge/api-v1.0-lightgrey)  [![GitHub license](https://img.shields.io/github/license/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet)](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet/blob/master/LICENSE)
# Java SDK for Translating Cloud Documents

[GroupDocs.Translation Cloud](https://products.groupdocs.cloud/translation) is Cloud API to translate Word, Excel and PowerPoint files as well as plain text.

For convenience of our Java customers we introduce a simple SDK used to add translation of Microsoft Word documents, Microsoft Excel workbooks, Microsoft PowerPoint presentations and plain text to your app with merely a few lines of code.

In detail, it's a set of SDKs for document and plain text translation in our Cloud. It supports translation of .doc, .docx, .docm, .xls, .xlsx, .xlsm, .ppt, .pptx, .pptm files. Just pass a specific file or text to the GroupDocs.Translation Cloud API, and it will translate and save translated file in our Cloud or will return translated text.

It is easy to get started with GroupDocs.Translation Cloud, and there is nothing to install. Create an account at [GroupDocs Cloud](https://dashboard.groupdocs.cloud/#/) and get your application information, then you are ready to use [SDKs](https://github.com/groupdocs-translation-cloud)

## Cloud Document Translation Features

- Translation of Microsoft Word, Microsoft Excel,, and Microsoft PowerPoint documents
- [10 languages and 22 languages pairs support](https://docs.groupdocs.cloud/translation/supported-languages/)
- Translation of tables, headers, footers, footnotes/endnotes, image captions in Word documents
- Translation of cells, charts, tables, pivot tables in Excel documents
- Translation of text frames, tables, headers, footers, charts, comments in PowerPoint presentations
- Translation of plain text
- API that allows you to manage your files and folders in our Cloud

## Supported Formats

GroupDocs.Translation Cloud allows to translate Microsoft Word and Excel documents. User should specify format of document to translate putting in the request’s body:

- **extension of word file (docx / docm / doc)** — to translate **Microsoft Word document**
- **extension of excel file (xlsx / xlsm / xls**) — to translate **Microsoft Excel workbook**
- **extension of powerpoint file (ppt / pptx / pptm**) — to translate **Microsoft PowerPoint presentation**

Additionally, user could obtain translated file in any other format available for conversion. Just specify output format of translated document putting file extension in the request’s body:

- **doc, docx** — docx, rtf, html, odt, txt, md, pdf, tiff, svg, xps
- **xls, xlsx** — xlsx, xlsb, html, pdf, xps, ods, md, docx, pptx, tiff
- **ppt, pptx** — pptx, pdf, tiff, html, xps, odp

## New Features & Enhancements Release 20.12
- Conversion of translated files to other formats is added

## New Features & Enhancements Release 20.10
- Microsoft PowerPoint presentations translation
- French-Italian language pair support

## New Features & Enhancements Release 20.9
- French-German language pair support

## New Features & Enhancements Release 20.8
- GroupDocs.Translation Java SDK

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we have provided and support [SDKs](https://github.com/groupdocs-translation-cloud) in many development languages to make it easier to integrate with us.

## Quickstart

Make your solution using [SDK](https://github.com/groupdocs-translation-cloud), follow these steps:

#### 1. Get API keys if you haven't

Make a personal account on [GroupDocs Cloud Dashboard](https://dashboard.groupdocs.cloud/#/) and click _Get Keys_. These keys are useful for all GroupDocs Cloud products. If you have any trouble, look at this [detailed manual](https://docs.groupdocs.cloud/translation/create-new-app-and-get-app-key-and-sid/).

#### 2. Run Demo
  * Checkout the SDK
  * Set Your ClientId & ClientSecret
  * Run Java console Demo
  * We recommend using JDK 13 to work with SDK


## SDK Details:

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


## Get Supported File Formats for Translation

```java
// Get Client Id and Client Secret from https://dashboard.groupdocs.cloud
String MyClientId = "";
String MyClientSecret = "";

// Create instance of the API
Configuration configuration = new Configuration(MyClientId, MyClientSecret);
TranslationApi api = new TranslationApi(configuration);

pair = "en-fr";
text = "Text to translate";
TextInfo textInfo = new TextInfo(pair, text);
TranslationTextRequest translationTextRequest = new TranslationTextRequest(TextInfo.toString());
TranslationTextResponse translateTextResponse = TranslationApi.TranslateText(translationTextRequest);
```

## GroupDocs.Translation Cloud SDKs in Popular Languages

| .NET | Java | Python |
|---|---|---|
| [GitHub](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-dotnet) | [GitHub](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-java) |[GitHub](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-python) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.translation-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-translation-cloud) | [PIP](https://pypi.org/project/groupdocs-translation-cloud/) |

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/translation/java) | [Docs](https://docs.groupdocs.cloud/translation/) | [Demos](https://products.groupdocs.app/viewer/family) | [API Reference](https://apireference.groupdocs.cloud/translation/) | [Examples](https://github.com/groupdocs-translation-cloud/groupdocs-translation-cloud-java) | [Blog](https://blog.groupdocs.cloud/category/translation/) | [Free Support](https://forum.groupdocs.cloud/c/translation) | [Free Trial](https://purchase.groupdocs.cloud/trial)
