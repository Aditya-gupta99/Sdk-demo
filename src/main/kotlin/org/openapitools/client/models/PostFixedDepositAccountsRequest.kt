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


import kotlinx.serialization.Serializable

/**
 * PostFixedDepositAccountsRequest
 *
 * @param clientId
 * @param dateFormat
 * @param depositAmount
 * @param depositPeriod
 * @param depositPeriodFrequencyId
 * @param locale
 * @param productId
 * @param submittedOnDate
 */

@Serializable
data class PostFixedDepositAccountsRequest(

    val clientId: kotlin.Long? = null,

    val dateFormat: kotlin.String? = null,

    val depositAmount: kotlin.Float? = null,

    val depositPeriod: kotlin.Int? = null,

    val depositPeriodFrequencyId: kotlin.Long? = null,

    val locale: kotlin.String? = null,

    val productId: kotlin.Long? = null,

    val submittedOnDate: kotlin.String? = null

)

