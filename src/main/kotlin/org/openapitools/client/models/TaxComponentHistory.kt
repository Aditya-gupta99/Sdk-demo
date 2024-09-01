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
 * @param createdBy 
 * @param createdDate 
 * @param id 
 * @param lastModifiedBy 
 * @param lastModifiedDate 
 * @param new 
 * @param percentage 
 */


data class TaxComponentHistory (

    @Json(name = "createdBy")
    val createdBy: kotlin.Long? = null,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "lastModifiedBy")
    val lastModifiedBy: kotlin.Long? = null,

    @Json(name = "lastModifiedDate")
    val lastModifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "new")
    val new: kotlin.Boolean? = null,

    @Json(name = "percentage")
    val percentage: java.math.BigDecimal? = null

) {


}

