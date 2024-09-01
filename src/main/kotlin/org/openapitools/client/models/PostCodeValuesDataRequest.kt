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
 * PostCodeValuesDataRequest
 *
 * @param description 
 * @param isActive 
 * @param name 
 * @param position 
 */


data class PostCodeValuesDataRequest (

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "position")
    val position: kotlin.Int? = null

) {


}

