/*
 * GroupDocs.Translation.ApiGateway.Web
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Request for resources files like resx
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T12:43:59.530580+03:00[Europe/Moscow]")
public class ResxFileRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  private String sourceLanguage = "en";

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "targetLanguages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  private List<String> targetLanguages = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private byte[] _file;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE_NAME = "originalFileName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE_NAME)
  private String originalFileName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
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
  private SavingModeEnum savingMode;

  public ResxFileRequest() {
  }

  public ResxFileRequest sourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Language of original file
   * @return sourceLanguage
  **/
  @javax.annotation.Nonnull
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public ResxFileRequest targetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
    return this;
  }

  public ResxFileRequest addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

   /**
   * List of target languages
   * @return targetLanguages
  **/
  @javax.annotation.Nonnull
  public List<String> getTargetLanguages() {
    return targetLanguages;
  }

  public void setTargetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public ResxFileRequest _file(byte[] _file) {
    this._file = _file;
    return this;
  }

   /**
   * File as byte array
   * @return _file
  **/
  @javax.annotation.Nullable
  public byte[] getFile() {
    return _file;
  }

  public void setFile(byte[] _file) {
    this._file = _file;
  }


  public ResxFileRequest originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

   /**
   * Type in the file name. If null will be as request ID.
   * @return originalFileName
  **/
  @javax.annotation.Nullable
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }


  public ResxFileRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Link to file for translation. Ignore, if \&quot;file\&quot; property not null
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public ResxFileRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Url or name of application using this SDK. Not required.
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public ResxFileRequest savingMode(SavingModeEnum savingMode) {
    this.savingMode = savingMode;
    return this;
  }

   /**
   * Toggle file saving mode for storage.  Is Files by default.
   * @return savingMode
  **/
  @javax.annotation.Nullable
  public SavingModeEnum getSavingMode() {
    return savingMode;
  }

  public void setSavingMode(SavingModeEnum savingMode) {
    this.savingMode = savingMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResxFileRequest resxFileRequest = (ResxFileRequest) o;
    return Objects.equals(this.sourceLanguage, resxFileRequest.sourceLanguage) &&
        Objects.equals(this.targetLanguages, resxFileRequest.targetLanguages) &&
        Arrays.equals(this._file, resxFileRequest._file) &&
        Objects.equals(this.originalFileName, resxFileRequest.originalFileName) &&
        Objects.equals(this.url, resxFileRequest.url) &&
        Objects.equals(this.origin, resxFileRequest.origin) &&
        Objects.equals(this.savingMode, resxFileRequest.savingMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLanguage, targetLanguages, Arrays.hashCode(_file), originalFileName, url, origin, savingMode);
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
    sb.append("class ResxFileRequest {\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    savingMode: ").append(toIndentedString(savingMode)).append("\n");
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
    openapiFields.add("file");
    openapiFields.add("originalFileName");
    openapiFields.add("url");
    openapiFields.add("origin");
    openapiFields.add("savingMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sourceLanguage");
    openapiRequiredFields.add("targetLanguages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResxFileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResxFileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResxFileRequest is not found in the empty JSON string", ResxFileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResxFileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResxFileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResxFileRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sourceLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceLanguage").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("targetLanguages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("targetLanguages").isJsonArray()) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResxFileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResxFileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResxFileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResxFileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ResxFileRequest>() {
           @Override
           public void write(JsonWriter out, ResxFileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResxFileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResxFileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResxFileRequest
  * @throws IOException if the JSON string is invalid with respect to ResxFileRequest
  */
  public static ResxFileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResxFileRequest.class);
  }

 /**
  * Convert an instance of ResxFileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

