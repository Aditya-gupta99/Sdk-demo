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
 * PutFixedDepositAccountsAccountIdRequest
 *
 * @param depositAmount 
 * @param locale 
 */


data class PutFixedDepositAccountsAccountIdRequest (

    @Json(name = "depositAmount")
    val depositAmount: kotlin.Float? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null

) {


}

