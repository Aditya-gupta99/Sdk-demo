/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param direction 
 * @param `property` 
 */


data class SortOrder (

    @Json(name = "direction")
    val direction: SortOrder.Direction? = null,

    @Json(name = "property")
    val `property`: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: ASC,DESC
     */
    @JsonClass(generateAdapter = false)
    enum class Direction(val value: kotlin.String) {
        @Json(name = "ASC") ASC("ASC"),
        @Json(name = "DESC") DESC("DESC");
    }

}

