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
 * @param savingsTransactions 
 * @param dateFormat 
 * @param loanTransactions 
 * @param locale 
 */


data class PostCollectionSheetChanges (

    @Json(name = "SavingsTransactions")
    val savingsTransactions: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "loanTransactions")
    val loanTransactions: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null

) {


}

