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
 * @param amtForTransfer
 * @param clientId
 * @param clientName
 * @param currency
 * @param fieldOfficerId
 * @param id
 * @param productId
 * @param productName
 */

@Serializable
data class GetAccountTransfersTemplateRefundByTransferFromAccount(

    val accountNo: kotlin.Long? = null,

    val amtForTransfer: kotlin.Float? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val currency: GetAccountTransfersTemplateRefundByTransferCurrency? = null,

    val fieldOfficerId: kotlin.Long? = null,

    val id: kotlin.Long? = null,

    val productId: kotlin.Long? = null,

    val productName: kotlin.String? = null

)

