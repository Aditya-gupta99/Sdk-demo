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
 *
 *
 * @param accountNo
 * @param accountType
 * @param currency
 * @param depositType
 * @param id
 * @param productId
 * @param productName
 * @param status
 * @param timeline
 */

@Serializable
data class GetCentersSavingsAccounts(

    val accountNo: kotlin.Long? = null,

    val accountType: GetCentersAccountType? = null,

    val currency: GetCentersCenterIdCurrency? = null,

    val depositType: GetCentersDepositType? = null,

    val id: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null,

    val status: GetCentersCenterIdStatus? = null,

    val timeline: GetCentersTimeline? = null

)

