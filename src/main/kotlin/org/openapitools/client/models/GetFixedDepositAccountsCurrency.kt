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
 * @param code 
 * @param decimalPlaces 
 * @param displayLabel 
 * @param displaySymbol 
 * @param inMultiplesOf 
 * @param name 
 * @param nameCode 
 */


data class GetFixedDepositAccountsCurrency (

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "decimalPlaces")
    val decimalPlaces: kotlin.Int? = null,

    @Json(name = "displayLabel")
    val displayLabel: kotlin.String? = null,

    @Json(name = "displaySymbol")
    val displaySymbol: kotlin.String? = null,

    @Json(name = "inMultiplesOf")
    val inMultiplesOf: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "nameCode")
    val nameCode: kotlin.String? = null

) {


}

