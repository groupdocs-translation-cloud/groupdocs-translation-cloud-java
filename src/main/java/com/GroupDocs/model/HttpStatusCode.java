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
import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets HttpStatusCode
 */
@JsonAdapter(HttpStatusCode.Adapter.class)
public enum HttpStatusCode {
  
  NUMBER_100(new BigDecimal("100")),
  
  NUMBER_101(new BigDecimal("101")),
  
  NUMBER_102(new BigDecimal("102")),
  
  NUMBER_103(new BigDecimal("103")),
  
  NUMBER_200(new BigDecimal("200")),
  
  NUMBER_201(new BigDecimal("201")),
  
  NUMBER_202(new BigDecimal("202")),
  
  NUMBER_203(new BigDecimal("203")),
  
  NUMBER_204(new BigDecimal("204")),
  
  NUMBER_205(new BigDecimal("205")),
  
  NUMBER_206(new BigDecimal("206")),
  
  NUMBER_207(new BigDecimal("207")),
  
  NUMBER_208(new BigDecimal("208")),
  
  NUMBER_226(new BigDecimal("226")),
  
  NUMBER_300(new BigDecimal("300")),
  
  NUMBER_301(new BigDecimal("301")),
  
  NUMBER_302(new BigDecimal("302")),
  
  NUMBER_303(new BigDecimal("303")),
  
  NUMBER_304(new BigDecimal("304")),
  
  NUMBER_305(new BigDecimal("305")),
  
  NUMBER_306(new BigDecimal("306")),
  
  NUMBER_307(new BigDecimal("307")),
  
  NUMBER_308(new BigDecimal("308")),
  
  NUMBER_400(new BigDecimal("400")),
  
  NUMBER_401(new BigDecimal("401")),
  
  NUMBER_402(new BigDecimal("402")),
  
  NUMBER_403(new BigDecimal("403")),
  
  NUMBER_404(new BigDecimal("404")),
  
  NUMBER_405(new BigDecimal("405")),
  
  NUMBER_406(new BigDecimal("406")),
  
  NUMBER_407(new BigDecimal("407")),
  
  NUMBER_408(new BigDecimal("408")),
  
  NUMBER_409(new BigDecimal("409")),
  
  NUMBER_410(new BigDecimal("410")),
  
  NUMBER_411(new BigDecimal("411")),
  
  NUMBER_412(new BigDecimal("412")),
  
  NUMBER_413(new BigDecimal("413")),
  
  NUMBER_414(new BigDecimal("414")),
  
  NUMBER_415(new BigDecimal("415")),
  
  NUMBER_416(new BigDecimal("416")),
  
  NUMBER_417(new BigDecimal("417")),
  
  NUMBER_421(new BigDecimal("421")),
  
  NUMBER_422(new BigDecimal("422")),
  
  NUMBER_423(new BigDecimal("423")),
  
  NUMBER_424(new BigDecimal("424")),
  
  NUMBER_426(new BigDecimal("426")),
  
  NUMBER_428(new BigDecimal("428")),
  
  NUMBER_429(new BigDecimal("429")),
  
  NUMBER_431(new BigDecimal("431")),
  
  NUMBER_451(new BigDecimal("451")),
  
  NUMBER_500(new BigDecimal("500")),
  
  NUMBER_501(new BigDecimal("501")),
  
  NUMBER_502(new BigDecimal("502")),
  
  NUMBER_503(new BigDecimal("503")),
  
  NUMBER_504(new BigDecimal("504")),
  
  NUMBER_505(new BigDecimal("505")),
  
  NUMBER_506(new BigDecimal("506")),
  
  NUMBER_507(new BigDecimal("507")),
  
  NUMBER_508(new BigDecimal("508")),
  
  NUMBER_510(new BigDecimal("510")),
  
  NUMBER_511(new BigDecimal("511"));

  private BigDecimal value;

  HttpStatusCode(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HttpStatusCode fromValue(BigDecimal value) {
    for (HttpStatusCode b : HttpStatusCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<HttpStatusCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final HttpStatusCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HttpStatusCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HttpStatusCode.fromValue(new BigDecimal(value));
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    HttpStatusCode.fromValue(new BigDecimal(value));
  }
}

