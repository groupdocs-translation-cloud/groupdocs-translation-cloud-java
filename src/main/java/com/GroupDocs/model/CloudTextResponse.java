/*
 * GroupDocs.Translation SDK
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.11.0
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
import com.groupdocs.model.HttpStatusCode;
import java.io.IOException;
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
 * CloudTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:31:57.131550+03:00[Europe/Moscow]", comments = "Generator version: 7.10.0")
public class CloudTextResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private HttpStatusCode status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  @javax.annotation.Nullable
  private Map<String, List<String>> translations;

  public CloudTextResponse() {
  }

  public CloudTextResponse status(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public HttpStatusCode getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable HttpStatusCode status) {
    this.status = status;
  }


  public CloudTextResponse message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * If file was translated correctly or text of error
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public CloudTextResponse translations(@javax.annotation.Nullable Map<String, List<String>> translations) {
    this.translations = translations;
    return this;
  }

  public CloudTextResponse putTranslationsItem(String key, List<String> translationsItem) {
    if (this.translations == null) {
      this.translations = new HashMap<>();
    }
    this.translations.put(key, translationsItem);
    return this;
  }

  /**
   * Translated texts
   * @return translations
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getTranslations() {
    return translations;
  }

  public void setTranslations(@javax.annotation.Nullable Map<String, List<String>> translations) {
    this.translations = translations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudTextResponse cloudTextResponse = (CloudTextResponse) o;
    return Objects.equals(this.status, cloudTextResponse.status) &&
        Objects.equals(this.message, cloudTextResponse.message) &&
        Objects.equals(this.translations, cloudTextResponse.translations);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, translations);
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
    sb.append("class CloudTextResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("translations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudTextResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudTextResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudTextResponse is not found in the empty JSON string", CloudTextResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudTextResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudTextResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        HttpStatusCode.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudTextResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudTextResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudTextResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudTextResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudTextResponse>() {
           @Override
           public void write(JsonWriter out, CloudTextResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudTextResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudTextResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudTextResponse
   * @throws IOException if the JSON string is invalid with respect to CloudTextResponse
   */
  public static CloudTextResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudTextResponse.class);
  }

  /**
   * Convert an instance of CloudTextResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

