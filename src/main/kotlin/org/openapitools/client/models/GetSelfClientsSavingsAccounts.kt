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
 * @param currency
 * @param id
 * @param productId
 * @param productName
 * @param status
 */

@Serializable
data class GetSelfClientsSavingsAccounts(

    val accountNo: kotlin.Long? = null,

    val currency: GetSelfClientsSavingsAccountsCurrency? = null,

    val id: kotlin.Int? = null,

    val productId: kotlin.Int? = null,

    val productName: kotlin.String? = null,

    val status: GetSelfClientsSavingsAccountsStatus? = null

)

