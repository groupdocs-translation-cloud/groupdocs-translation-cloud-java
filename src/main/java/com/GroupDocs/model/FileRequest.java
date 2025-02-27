/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.2.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupdocs.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.model.WorksheetData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * FileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T16:58:51.190654+03:00[Europe/Moscow]", comments = "Generator version: 7.11.0")
public class FileRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  @javax.annotation.Nullable
  private String sourceLanguage = "en";

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "targetLanguages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  @javax.annotation.Nullable
  private List<String> targetLanguages = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGINAL_FILE_NAME = "originalFileName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE_NAME)
  @javax.annotation.Nullable
  private String originalFileName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  /**
   * Toggle file saving mode for storage.  Is Files by default.
   */
  @JsonAdapter(SavingModeEnum.Adapter.class)
  public enum SavingModeEnum {
    FILES("Files"),
    
    ARCHIVE("Archive"),
    
    BOTH("Both");

    private String value;

    SavingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SavingModeEnum fromValue(String value) {
      for (SavingModeEnum b : SavingModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SavingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SavingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SavingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SavingModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SavingModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SAVING_MODE = "savingMode";
  @SerializedName(SERIALIZED_NAME_SAVING_MODE)
  @javax.annotation.Nullable
  private SavingModeEnum savingMode;

  /**
   * Input file format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    UNKNOWN("Unknown"),
    
    DOC("Doc"),
    
    DOCX("Docx"),
    
    DOCM("Docm"),
    
    XLS("Xls"),
    
    XLSX("Xlsx"),
    
    XLSM("Xlsm"),
    
    PPT("Ppt"),
    
    PPTX("Pptx"),
    
    PPTM("Pptm"),
    
    TXT("Txt"),
    
    PDF("Pdf"),
    
    MD("Md"),
    
    RESX("Resx"),
    
    HTML("Html"),
    
    RTF("Rtf"),
    
    ODT("Odt"),
    
    ODS("Ods"),
    
    ODP("Odp"),
    
    CSV("Csv"),
    
    TSV("Tsv"),
    
    SRT("Srt"),
    
    PDFX("Pdfx"),
    
    MP3("Mp3"),
    
    WAV("Wav"),
    
    FLAC("Flac"),
    
    M4A("M4a"),
    
    AAC("Aac"),
    
    WMA("Wma"),
    
    FLV("Flv"),
    
    MKV("Mkv"),
    
    WEBM("Webm"),
    
    AVI("Avi"),
    
    MOV("Mov"),
    
    WMV("Wmv"),
    
    RM("Rm"),
    
    MPG("Mpg");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormatEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  @javax.annotation.Nullable
  private FormatEnum format = FormatEnum.UNKNOWN;

  public static final String SERIALIZED_NAME_OUTPUT_FORMAT = "outputFormat";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMAT)
  @javax.annotation.Nullable
  private String outputFormat;

  public static final String SERIALIZED_NAME_MASTERS = "masters";
  @SerializedName(SERIALIZED_NAME_MASTERS)
  @javax.annotation.Nullable
  private Boolean masters = false;

  public static final String SERIALIZED_NAME_FORMATTING = "formatting";
  @SerializedName(SERIALIZED_NAME_FORMATTING)
  @javax.annotation.Nullable
  private Boolean formatting = true;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  @javax.annotation.Nullable
  private String route;

  public static final String SERIALIZED_NAME_SEPARATOR = "separator";
  @SerializedName(SERIALIZED_NAME_SEPARATOR)
  @javax.annotation.Nullable
  private String separator;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  @javax.annotation.Nullable
  private List<Integer> elements;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  @javax.annotation.Nullable
  private Map<String, WorksheetData> ranges;

  public static final String SERIALIZED_NAME_SHORTCODEDICT = "shortcodedict";
  @SerializedName(SERIALIZED_NAME_SHORTCODEDICT)
  @javax.annotation.Nullable
  private Map<String, List<String>> shortcodedict;

  public static final String SERIALIZED_NAME_FRONT_MATTER_LIST = "frontMatterList";
  @SerializedName(SERIALIZED_NAME_FRONT_MATTER_LIST)
  @javax.annotation.Nullable
  private List<List<String>> frontMatterList;

  public static final String SERIALIZED_NAME_IGNORE_LIST = "ignoreList";
  @SerializedName(SERIALIZED_NAME_IGNORE_LIST)
  @javax.annotation.Nullable
  private List<String> ignoreList;

  public static final String SERIALIZED_NAME_IS_WHITE_LIST = "isWhiteList";
  @SerializedName(SERIALIZED_NAME_IS_WHITE_LIST)
  @javax.annotation.Nullable
  private Boolean isWhiteList;

  public FileRequest() {
  }

  public FileRequest sourceLanguage(@javax.annotation.Nullable String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

  /**
   * Language of original file
   * @return sourceLanguage
   */
  @javax.annotation.Nullable
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(@javax.annotation.Nullable String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public FileRequest targetLanguages(@javax.annotation.Nullable List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
    return this;
  }

  public FileRequest addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

  /**
   * List of target languages
   * @return targetLanguages
   */
  @javax.annotation.Nullable
  public List<String> getTargetLanguages() {
    return targetLanguages;
  }

  public void setTargetLanguages(@javax.annotation.Nullable List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public FileRequest originalFileName(@javax.annotation.Nullable String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Type in the file name. If null will be as request ID.
   * @return originalFileName
   */
  @javax.annotation.Nullable
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(@javax.annotation.Nullable String originalFileName) {
    this.originalFileName = originalFileName;
  }


  public FileRequest url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Link to file for translation. Ignore, if \&quot;file\&quot; property not null
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public FileRequest origin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Url or name of application using this SDK. Not required.
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
  }


  public FileRequest savingMode(@javax.annotation.Nullable SavingModeEnum savingMode) {
    this.savingMode = savingMode;
    return this;
  }

  /**
   * Toggle file saving mode for storage.  Is Files by default.
   * @return savingMode
   */
  @javax.annotation.Nullable
  public SavingModeEnum getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(@javax.annotation.Nullable SavingModeEnum savingMode) {
    this.savingMode = savingMode;
  }


  public FileRequest format(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Input file format
   * @return format
   */
  @javax.annotation.Nullable
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(@javax.annotation.Nullable FormatEnum format) {
    this.format = format;
  }


  public FileRequest outputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * output file format
   * @return outputFormat
   */
  @javax.annotation.Nullable
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(@javax.annotation.Nullable String outputFormat) {
    this.outputFormat = outputFormat;
  }


  public FileRequest masters(@javax.annotation.Nullable Boolean masters) {
    this.masters = masters;
    return this;
  }

  /**
   * If translate master slides
   * @return masters
   */
  @javax.annotation.Nullable
  public Boolean getMasters() {
    return masters;
  }

  public void setMasters(@javax.annotation.Nullable Boolean masters) {
    this.masters = masters;
  }


  public FileRequest formatting(@javax.annotation.Nullable Boolean formatting) {
    this.formatting = formatting;
    return this;
  }

  /**
   * If document&#39;s formatting should be preserved, default true
   * @return formatting
   */
  @javax.annotation.Nullable
  public Boolean getFormatting() {
    return formatting;
  }

  public void setFormatting(@javax.annotation.Nullable Boolean formatting) {
    this.formatting = formatting;
  }


  public FileRequest route(@javax.annotation.Nullable String route) {
    this.route = route;
    return this;
  }

  /**
   * Endpoint route
   * @return route
   */
  @javax.annotation.Nullable
  public String getRoute() {
    return route;
  }

  public void setRoute(@javax.annotation.Nullable String route) {
    this.route = route;
  }


  public FileRequest separator(@javax.annotation.Nullable String separator) {
    this.separator = separator;
    return this;
  }

  /**
   * Separator in files
   * @return separator
   */
  @javax.annotation.Nullable
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(@javax.annotation.Nullable String separator) {
    this.separator = separator;
  }


  public FileRequest elements(@javax.annotation.Nullable List<Integer> elements) {
    this.elements = elements;
    return this;
  }

  public FileRequest addElementsItem(Integer elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * List of slides to translate (1-based index). If not present, translate all elements (page, slide, worksheet)
   * @return elements
   */
  @javax.annotation.Nullable
  public List<Integer> getElements() {
    return elements;
  }

  public void setElements(@javax.annotation.Nullable List<Integer> elements) {
    this.elements = elements;
  }


  public FileRequest ranges(@javax.annotation.Nullable Map<String, WorksheetData> ranges) {
    this.ranges = ranges;
    return this;
  }

  public FileRequest putRangesItem(String key, WorksheetData rangesItem) {
    if (this.ranges == null) {
      this.ranges = new HashMap<>();
    }
    this.ranges.put(key, rangesItem);
    return this;
  }

  /**
   * Dictionary of ranges in Excel workbooks
   * @return ranges
   */
  @javax.annotation.Nullable
  public Map<String, WorksheetData> getRanges() {
    return ranges;
  }

  public void setRanges(@javax.annotation.Nullable Map<String, WorksheetData> ranges) {
    this.ranges = ranges;
  }


  public FileRequest shortcodedict(@javax.annotation.Nullable Map<String, List<String>> shortcodedict) {
    this.shortcodedict = shortcodedict;
    return this;
  }

  public FileRequest putShortcodedictItem(String key, List<String> shortcodedictItem) {
    if (this.shortcodedict == null) {
      this.shortcodedict = new HashMap<>();
    }
    this.shortcodedict.put(key, shortcodedictItem);
    return this;
  }

  /**
   * Dictionary of short code names and parameters names to translate
   * @return shortcodedict
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getShortcodedict() {
    return shortcodedict;
  }

  public void setShortcodedict(@javax.annotation.Nullable Map<String, List<String>> shortcodedict) {
    this.shortcodedict = shortcodedict;
  }


  public FileRequest frontMatterList(@javax.annotation.Nullable List<List<String>> frontMatterList) {
    this.frontMatterList = frontMatterList;
    return this;
  }

  public FileRequest addFrontMatterListItem(List<String> frontMatterListItem) {
    if (this.frontMatterList == null) {
      this.frontMatterList = new ArrayList<>();
    }
    this.frontMatterList.add(frontMatterListItem);
    return this;
  }

  /**
   * Dictionary where key is zero-based front matter index and value is list of lists of front matter paths
   * @return frontMatterList
   */
  @javax.annotation.Nullable
  public List<List<String>> getFrontMatterList() {
    return frontMatterList;
  }

  public void setFrontMatterList(@javax.annotation.Nullable List<List<String>> frontMatterList) {
    this.frontMatterList = frontMatterList;
  }


  public FileRequest ignoreList(@javax.annotation.Nullable List<String> ignoreList) {
    this.ignoreList = ignoreList;
    return this;
  }

  public FileRequest addIgnoreListItem(String ignoreListItem) {
    if (this.ignoreList == null) {
      this.ignoreList = new ArrayList<>();
    }
    this.ignoreList.add(ignoreListItem);
    return this;
  }

  /**
   * List of elements for Xml, Json and Yaml formats. Determines which items should be blacklisted or whitelisted for processing depending on GroupDocs.Translation.ApiGateway.DTO.FileRequest.IsWhiteList.
   * @return ignoreList
   */
  @javax.annotation.Nullable
  public List<String> getIgnoreList() {
    return ignoreList;
  }

  public void setIgnoreList(@javax.annotation.Nullable List<String> ignoreList) {
    this.ignoreList = ignoreList;
  }


  public FileRequest isWhiteList(@javax.annotation.Nullable Boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
    return this;
  }

  /**
   * Determines to which list the items in GroupDocs.Translation.ApiGateway.DTO.FileRequest.IgnoreList should be allocated. The default is the black list.
   * @return isWhiteList
   */
  @javax.annotation.Nullable
  public Boolean getIsWhiteList() {
    return isWhiteList;
  }

  public void setIsWhiteList(@javax.annotation.Nullable Boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRequest fileRequest = (FileRequest) o;
    return Objects.equals(this.sourceLanguage, fileRequest.sourceLanguage) &&
        Objects.equals(this.targetLanguages, fileRequest.targetLanguages) &&
        Objects.equals(this.originalFileName, fileRequest.originalFileName) &&
        Objects.equals(this.url, fileRequest.url) &&
        Objects.equals(this.origin, fileRequest.origin) &&
        Objects.equals(this.savingMode, fileRequest.savingMode) &&
        Objects.equals(this.format, fileRequest.format) &&
        Objects.equals(this.outputFormat, fileRequest.outputFormat) &&
        Objects.equals(this.masters, fileRequest.masters) &&
        Objects.equals(this.formatting, fileRequest.formatting) &&
        Objects.equals(this.route, fileRequest.route) &&
        Objects.equals(this.separator, fileRequest.separator) &&
        Objects.equals(this.elements, fileRequest.elements) &&
        Objects.equals(this.ranges, fileRequest.ranges) &&
        Objects.equals(this.shortcodedict, fileRequest.shortcodedict) &&
        Objects.equals(this.frontMatterList, fileRequest.frontMatterList) &&
        Objects.equals(this.ignoreList, fileRequest.ignoreList) &&
        Objects.equals(this.isWhiteList, fileRequest.isWhiteList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLanguage, targetLanguages, originalFileName, url, origin, savingMode, format, outputFormat, masters, formatting, route, separator, elements, ranges, shortcodedict, frontMatterList, ignoreList, isWhiteList);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRequest {\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
    sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    shortcodedict: ").append(toIndentedString(shortcodedict)).append("\n");
    sb.append("    frontMatterList: ").append(toIndentedString(frontMatterList)).append("\n");
    sb.append("    ignoreList: ").append(toIndentedString(ignoreList)).append("\n");
    sb.append("    isWhiteList: ").append(toIndentedString(isWhiteList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sourceLanguage");
    openapiFields.add("targetLanguages");
    openapiFields.add("originalFileName");
    openapiFields.add("url");
    openapiFields.add("origin");
    openapiFields.add("savingMode");
    openapiFields.add("format");
    openapiFields.add("outputFormat");
    openapiFields.add("masters");
    openapiFields.add("formatting");
    openapiFields.add("route");
    openapiFields.add("separator");
    openapiFields.add("elements");
    openapiFields.add("ranges");
    openapiFields.add("shortcodedict");
    openapiFields.add("frontMatterList");
    openapiFields.add("ignoreList");
    openapiFields.add("isWhiteList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileRequest is not found in the empty JSON string", FileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sourceLanguage") != null && !jsonObj.get("sourceLanguage").isJsonNull()) && !jsonObj.get("sourceLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceLanguage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targetLanguages") != null && !jsonObj.get("targetLanguages").isJsonNull() && !jsonObj.get("targetLanguages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLanguages` to be an array in the JSON string but got `%s`", jsonObj.get("targetLanguages").toString()));
      }
      if ((jsonObj.get("originalFileName") != null && !jsonObj.get("originalFileName").isJsonNull()) && !jsonObj.get("originalFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFileName").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) && !jsonObj.get("savingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `savingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("savingMode").toString()));
      }
      // validate the optional field `savingMode`
      if (jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) {
        SavingModeEnum.validateJsonElement(jsonObj.get("savingMode"));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // validate the optional field `format`
      if (jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) {
        FormatEnum.validateJsonElement(jsonObj.get("format"));
      }
      if ((jsonObj.get("outputFormat") != null && !jsonObj.get("outputFormat").isJsonNull()) && !jsonObj.get("outputFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputFormat").toString()));
      }
      if ((jsonObj.get("route") != null && !jsonObj.get("route").isJsonNull()) && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
      if ((jsonObj.get("separator") != null && !jsonObj.get("separator").isJsonNull()) && !jsonObj.get("separator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `separator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("separator").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("elements") != null && !jsonObj.get("elements").isJsonNull() && !jsonObj.get("elements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `elements` to be an array in the JSON string but got `%s`", jsonObj.get("elements").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("frontMatterList") != null && !jsonObj.get("frontMatterList").isJsonNull() && !jsonObj.get("frontMatterList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontMatterList` to be an array in the JSON string but got `%s`", jsonObj.get("frontMatterList").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ignoreList") != null && !jsonObj.get("ignoreList").isJsonNull() && !jsonObj.get("ignoreList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignoreList` to be an array in the JSON string but got `%s`", jsonObj.get("ignoreList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRequest>() {
           @Override
           public void write(JsonWriter out, FileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileRequest
   * @throws IOException if the JSON string is invalid with respect to FileRequest
   */
  public static FileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRequest.class);
  }

  /**
   * Convert an instance of FileRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

