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

import org.openapitools.client.models.GetOfficesResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetOfficesTemplateResponse
 *
 * @param allowedParents 
 * @param openingDate 
 */


data class GetOfficesTemplateResponse (

    @Json(name = "allowedParents")
    val allowedParents: kotlin.collections.List<GetOfficesResponse>? = null,

    @Json(name = "openingDate")
    val openingDate: java.time.LocalDate? = null

) {


}

