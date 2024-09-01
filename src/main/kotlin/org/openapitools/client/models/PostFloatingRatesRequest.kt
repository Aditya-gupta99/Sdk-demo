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

import org.openapitools.client.models.PostFloatingRatesRatePeriods

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostFloatingRatesRequest
 *
 * @param isActive 
 * @param isBaseLendingRate 
 * @param name 
 * @param ratePeriods 
 */


data class PostFloatingRatesRequest (

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "isBaseLendingRate")
    val isBaseLendingRate: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "ratePeriods")
    val ratePeriods: kotlin.collections.Set<PostFloatingRatesRatePeriods>? = null

) {


}

