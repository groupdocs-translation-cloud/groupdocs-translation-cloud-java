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


package org.openapitools.client.api;

import com.groupdocs.ApiException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SwaggerApi
 */
@Disabled
public class SwaggerApiTest {

    private final SwaggerApi api = new SwaggerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void swaggerSpecGetTest() throws ApiException {
        Boolean isYaml = null;
        Boolean serialaizeAsV2 = null;
        api.swaggerSpecGet(isYaml, serialaizeAsV2);
        // TODO: test validations
    }

}
