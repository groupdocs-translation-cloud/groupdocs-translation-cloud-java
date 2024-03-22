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
 * TextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-21T17:04:49.674171+03:00[Europe/Moscow]", comments = "Generator version: 7.4.0")
public class TextRequest {
  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  private String sourceLanguage;

  public static final String SERIALIZED_NAME_TARGET_LANGUAGES = "targetLanguages";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGES)
  private List<String> targetLanguages;

  public static final String SERIALIZED_NAME_TEXTS = "texts";
  @SerializedName(SERIALIZED_NAME_TEXTS)
  private List<String> texts;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_CONTAINS_MARKDOWN = "containsMarkdown";
  @SerializedName(SERIALIZED_NAME_CONTAINS_MARKDOWN)
  private Boolean containsMarkdown;

  public TextRequest() {
  }

  public TextRequest sourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Language of original text
   * @return sourceLanguage
  **/
  @javax.annotation.Nullable
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  public TextRequest targetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
    return this;
  }

  public TextRequest addTargetLanguagesItem(String targetLanguagesItem) {
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
  @javax.annotation.Nullable
  public List<String> getTargetLanguages() {
    return targetLanguages;
  }

  public void setTargetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public TextRequest texts(List<String> texts) {
    this.texts = texts;
    return this;
  }

  public TextRequest addTextsItem(String textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<>();
    }
    this.texts.add(textsItem);
    return this;
  }

   /**
   * Text array to translate
   * @return texts
  **/
  @javax.annotation.Nullable
  public List<String> getTexts() {
    return texts;
  }

  public void setTexts(List<String> texts) {
    this.texts = texts;
  }


  public TextRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * For analysis only
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public TextRequest containsMarkdown(Boolean containsMarkdown) {
    this.containsMarkdown = containsMarkdown;
    return this;
  }

   /**
   * Set to true if you want to handle markdown in text
   * @return containsMarkdown
  **/
  @javax.annotation.Nullable
  public Boolean getContainsMarkdown() {
    return containsMarkdown;
  }

  public void setContainsMarkdown(Boolean containsMarkdown) {
    this.containsMarkdown = containsMarkdown;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextRequest textRequest = (TextRequest) o;
    return Objects.equals(this.sourceLanguage, textRequest.sourceLanguage) &&
        Objects.equals(this.targetLanguages, textRequest.targetLanguages) &&
        Objects.equals(this.texts, textRequest.texts) &&
        Objects.equals(this.origin, textRequest.origin) &&
        Objects.equals(this.containsMarkdown, textRequest.containsMarkdown);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLanguage, targetLanguages, texts, origin, containsMarkdown);
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
    sb.append("class TextRequest {\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    containsMarkdown: ").append(toIndentedString(containsMarkdown)).append("\n");
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
    openapiFields.add("texts");
    openapiFields.add("origin");
    openapiFields.add("containsMarkdown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TextRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextRequest is not found in the empty JSON string", TextRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("texts") != null && !jsonObj.get("texts").isJsonNull() && !jsonObj.get("texts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `texts` to be an array in the JSON string but got `%s`", jsonObj.get("texts").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TextRequest>() {
           @Override
           public void write(JsonWriter out, TextRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TextRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TextRequest
  * @throws IOException if the JSON string is invalid with respect to TextRequest
  */
  public static TextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextRequest.class);
  }

 /**
  * Convert an instance of TextRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

