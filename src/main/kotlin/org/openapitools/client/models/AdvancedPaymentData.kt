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

import org.openapitools.client.models.PaymentAllocationOrder

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param futureInstallmentAllocationRule 
 * @param paymentAllocationOrder 
 * @param transactionType 
 */


data class AdvancedPaymentData (

    @Json(name = "futureInstallmentAllocationRule")
    val futureInstallmentAllocationRule: kotlin.String? = null,

    @Json(name = "paymentAllocationOrder")
    val paymentAllocationOrder: kotlin.collections.List<PaymentAllocationOrder>? = null,

    @Json(name = "transactionType")
    val transactionType: kotlin.String? = null

) {


}

