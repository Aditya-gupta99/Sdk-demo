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

import org.openapitools.client.models.GetAccountsCurrency
import org.openapitools.client.models.GetAccountsStatus
import org.openapitools.client.models.GetAccountsTimeline

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param accountNo 
 * @param currency 
 * @param id 
 * @param productId 
 * @param productName 
 * @param status 
 * @param timeline 
 * @param totalApprovedShares 
 * @param totalPendingForApprovalShares 
 */

@Serializable
data class GetAccountsSummary (

    val accountNo: kotlin.Long? = null,

    val currency: GetAccountsCurrency? = null,

    val id: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

    val status: GetAccountsStatus? = null,

    val timeline: GetAccountsTimeline? = null,

    val totalApprovedShares: kotlin.Int? = null,

    val totalPendingForApprovalShares: kotlin.Int? = null

) {


}

