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
 * @param clientCollateralId 
 * @param quantity 
 */


data class PutLoansLoanIdCollateral (

    @Json(name = "clientCollateralId")
    val clientCollateralId: kotlin.Long? = null,

    @Json(name = "quantity")
    val quantity: java.math.BigDecimal? = null

) {


}

