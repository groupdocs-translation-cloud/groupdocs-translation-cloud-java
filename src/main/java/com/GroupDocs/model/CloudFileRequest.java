/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 23.12.0
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * CloudFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-21T17:04:49.674171+03:00[Europe/Moscow]", comments = "Generator version: 7.4.0")
public class CloudFileRequest {
  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_OUT_FORMAT = "outFormat";
  @SerializedName(SERIALIZED_NAME_OUT_FORMAT)
  private String outFormat;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Integer> ids;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MASTERS = "masters";
  @SerializedName(SERIALIZED_NAME_MASTERS)
  private Boolean masters;

  public static final String SERIALIZED_NAME_FORMATTING = "formatting";
  @SerializedName(SERIALIZED_NAME_FORMATTING)
  private Boolean formatting;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<Integer> elements;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private Map<String, WorksheetData> ranges;

  public static final String SERIALIZED_NAME_SHORT_CODE_DICT = "shortCodeDict";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE_DICT)
  private Map<String, List<String>> shortCodeDict;

  public static final String SERIALIZED_NAME_FRONT_MATTER_LIST = "frontMatterList";
  @SerializedName(SERIALIZED_NAME_FRONT_MATTER_LIST)
  private List<List<String>> frontMatterList;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_SEPARATOR = "separator";
  @SerializedName(SERIALIZED_NAME_SEPARATOR)
  private String separator;

  public static final String SERIALIZED_NAME_IS_PAID = "isPaid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  /**
   * Toggle files saving mode
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
  private SavingModeEnum savingMode;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Map<String, String> details;

  public CloudFileRequest() {
  }

  public CloudFileRequest format(String format) {
    this.format = format;
    return this;
  }

   /**
   * \&quot;doc(x|m)\&quot; if Word document, \&quot;xls(x|m)\&quot; if Excel workbook
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public CloudFileRequest outFormat(String outFormat) {
    this.outFormat = outFormat;
    return this;
  }

   /**
   * output file format
   * @return outFormat
  **/
  @javax.annotation.Nullable
  public String getOutFormat() {
    return outFormat;
  }

  public void setOutFormat(String outFormat) {
    this.outFormat = outFormat;
  }


  public CloudFileRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * id of request
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CloudFileRequest ids(List<Integer> ids) {
    this.ids = ids;
    return this;
  }

  public CloudFileRequest addIdsItem(Integer idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Language pairs to translate
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Integer> getIds() {
    return ids;
  }

  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }


  public CloudFileRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Link to file for translation
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public CloudFileRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public CloudFileRequest masters(Boolean masters) {
    this.masters = masters;
    return this;
  }

   /**
   * If translate master slides
   * @return masters
  **/
  @javax.annotation.Nullable
  public Boolean getMasters() {
    return masters;
  }

  public void setMasters(Boolean masters) {
    this.masters = masters;
  }


  public CloudFileRequest formatting(Boolean formatting) {
    this.formatting = formatting;
    return this;
  }

   /**
   * If document&#39;s formatting should be preserved, default true
   * @return formatting
  **/
  @javax.annotation.Nullable
  public Boolean getFormatting() {
    return formatting;
  }

  public void setFormatting(Boolean formatting) {
    this.formatting = formatting;
  }


  public CloudFileRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * for analysis only
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public CloudFileRequest elements(List<Integer> elements) {
    this.elements = elements;
    return this;
  }

  public CloudFileRequest addElementsItem(Integer elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * List of slides to translate
   * @return elements
  **/
  @javax.annotation.Nullable
  public List<Integer> getElements() {
    return elements;
  }

  public void setElements(List<Integer> elements) {
    this.elements = elements;
  }


  public CloudFileRequest ranges(Map<String, WorksheetData> ranges) {
    this.ranges = ranges;
    return this;
  }

  public CloudFileRequest putRangesItem(String key, WorksheetData rangesItem) {
    if (this.ranges == null) {
      this.ranges = new HashMap<>();
    }
    this.ranges.put(key, rangesItem);
    return this;
  }

   /**
   * Dictionary of ranges in Excel workbooks
   * @return ranges
  **/
  @javax.annotation.Nullable
  public Map<String, WorksheetData> getRanges() {
    return ranges;
  }

  public void setRanges(Map<String, WorksheetData> ranges) {
    this.ranges = ranges;
  }


  public CloudFileRequest shortCodeDict(Map<String, List<String>> shortCodeDict) {
    this.shortCodeDict = shortCodeDict;
    return this;
  }

  public CloudFileRequest putShortCodeDictItem(String key, List<String> shortCodeDictItem) {
    if (this.shortCodeDict == null) {
      this.shortCodeDict = new HashMap<>();
    }
    this.shortCodeDict.put(key, shortCodeDictItem);
    return this;
  }

   /**
   * Dictiory of short code names and parameters names to translate
   * @return shortCodeDict
  **/
  @javax.annotation.Nullable
  public Map<String, List<String>> getShortCodeDict() {
    return shortCodeDict;
  }

  public void setShortCodeDict(Map<String, List<String>> shortCodeDict) {
    this.shortCodeDict = shortCodeDict;
  }


  public CloudFileRequest frontMatterList(List<List<String>> frontMatterList) {
    this.frontMatterList = frontMatterList;
    return this;
  }

  public CloudFileRequest addFrontMatterListItem(List<String> frontMatterListItem) {
    if (this.frontMatterList == null) {
      this.frontMatterList = new ArrayList<>();
    }
    this.frontMatterList.add(frontMatterListItem);
    return this;
  }

   /**
   * Dictionary where key is zero-based front matter index and value is list of lists of front matter paths
   * @return frontMatterList
  **/
  @javax.annotation.Nullable
  public List<List<String>> getFrontMatterList() {
    return frontMatterList;
  }

  public void setFrontMatterList(List<List<String>> frontMatterList) {
    this.frontMatterList = frontMatterList;
  }


  public CloudFileRequest originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Original name of file
   * @return originalName
  **/
  @javax.annotation.Nullable
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public CloudFileRequest separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Separator in files
   * @return separator
  **/
  @javax.annotation.Nullable
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }


  public CloudFileRequest isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

   /**
   * Set true if paid user
   * @return isPaid
  **/
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public CloudFileRequest savingMode(SavingModeEnum savingMode) {
    this.savingMode = savingMode;
    return this;
  }

   /**
   * Toggle files saving mode
   * @return savingMode
  **/
  @javax.annotation.Nullable
  public SavingModeEnum getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(SavingModeEnum savingMode) {
    this.savingMode = savingMode;
  }


  public CloudFileRequest details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public CloudFileRequest putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Details of the requests. Using for e2e tracking
   * @return details
  **/
  @javax.annotation.Nullable
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFileRequest cloudFileRequest = (CloudFileRequest) o;
    return Objects.equals(this.format, cloudFileRequest.format) &&
        Objects.equals(this.outFormat, cloudFileRequest.outFormat) &&
        Objects.equals(this.requestId, cloudFileRequest.requestId) &&
        Objects.equals(this.ids, cloudFileRequest.ids) &&
        Objects.equals(this.url, cloudFileRequest.url) &&
        Objects.equals(this.size, cloudFileRequest.size) &&
        Objects.equals(this.masters, cloudFileRequest.masters) &&
        Objects.equals(this.formatting, cloudFileRequest.formatting) &&
        Objects.equals(this.origin, cloudFileRequest.origin) &&
        Objects.equals(this.elements, cloudFileRequest.elements) &&
        Objects.equals(this.ranges, cloudFileRequest.ranges) &&
        Objects.equals(this.shortCodeDict, cloudFileRequest.shortCodeDict) &&
        Objects.equals(this.frontMatterList, cloudFileRequest.frontMatterList) &&
        Objects.equals(this.originalName, cloudFileRequest.originalName) &&
        Objects.equals(this.separator, cloudFileRequest.separator) &&
        Objects.equals(this.isPaid, cloudFileRequest.isPaid) &&
        Objects.equals(this.savingMode, cloudFileRequest.savingMode) &&
        Objects.equals(this.details, cloudFileRequest.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, outFormat, requestId, ids, url, size, masters, formatting, origin, elements, ranges, shortCodeDict, frontMatterList, originalName, separator, isPaid, savingMode, details);
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
    sb.append("class CloudFileRequest {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    outFormat: ").append(toIndentedString(outFormat)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
    sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    shortCodeDict: ").append(toIndentedString(shortCodeDict)).append("\n");
    sb.append("    frontMatterList: ").append(toIndentedString(frontMatterList)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("format");
    openapiFields.add("outFormat");
    openapiFields.add("requestId");
    openapiFields.add("ids");
    openapiFields.add("url");
    openapiFields.add("size");
    openapiFields.add("masters");
    openapiFields.add("formatting");
    openapiFields.add("origin");
    openapiFields.add("elements");
    openapiFields.add("ranges");
    openapiFields.add("shortCodeDict");
    openapiFields.add("frontMatterList");
    openapiFields.add("originalName");
    openapiFields.add("separator");
    openapiFields.add("isPaid");
    openapiFields.add("savingMode");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CloudFileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudFileRequest is not found in the empty JSON string", CloudFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("outFormat") != null && !jsonObj.get("outFormat").isJsonNull()) && !jsonObj.get("outFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outFormat").toString()));
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull() && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("elements") != null && !jsonObj.get("elements").isJsonNull() && !jsonObj.get("elements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `elements` to be an array in the JSON string but got `%s`", jsonObj.get("elements").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("frontMatterList") != null && !jsonObj.get("frontMatterList").isJsonNull() && !jsonObj.get("frontMatterList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `frontMatterList` to be an array in the JSON string but got `%s`", jsonObj.get("frontMatterList").toString()));
      }
      if ((jsonObj.get("originalName") != null && !jsonObj.get("originalName").isJsonNull()) && !jsonObj.get("originalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalName").toString()));
      }
      if ((jsonObj.get("separator") != null && !jsonObj.get("separator").isJsonNull()) && !jsonObj.get("separator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `separator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("separator").toString()));
      }
      if ((jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) && !jsonObj.get("savingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `savingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("savingMode").toString()));
      }
      // validate the optional field `savingMode`
      if (jsonObj.get("savingMode") != null && !jsonObj.get("savingMode").isJsonNull()) {
        SavingModeEnum.validateJsonElement(jsonObj.get("savingMode"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudFileRequest>() {
           @Override
           public void write(JsonWriter out, CloudFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudFileRequest
  * @throws IOException if the JSON string is invalid with respect to CloudFileRequest
  */
  public static CloudFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudFileRequest.class);
  }

 /**
  * Convert an instance of CloudFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
