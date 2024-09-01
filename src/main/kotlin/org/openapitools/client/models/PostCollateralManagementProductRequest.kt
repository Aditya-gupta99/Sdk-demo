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
 * PostCollateralManagementProductRequest
 *
 * @param basePrice 
 * @param currency 
 * @param name 
 * @param pctToBase 
 * @param quality 
 * @param unitType 
 */


data class PostCollateralManagementProductRequest (

    @Json(name = "basePrice")
    val basePrice: java.math.BigDecimal? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "pctToBase")
    val pctToBase: java.math.BigDecimal? = null,

    @Json(name = "quality")
    val quality: kotlin.String? = null,

    @Json(name = "unitType")
    val unitType: kotlin.String? = null

) {


}

