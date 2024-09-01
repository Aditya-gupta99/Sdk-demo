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
 * @param loanId 
 * @param paymentTypeId 
 * @param receiptNumber 
 * @param transactionAmount 
 */


data class PostCollectionSheetBulkRepaymentTransactions (

    @Json(name = "loanId")
    val loanId: kotlin.Long? = null,

    @Json(name = "paymentTypeId")
    val paymentTypeId: kotlin.Long? = null,

    @Json(name = "receiptNumber")
    val receiptNumber: kotlin.Long? = null,

    @Json(name = "transactionAmount")
    val transactionAmount: kotlin.Double? = null

) {


}

