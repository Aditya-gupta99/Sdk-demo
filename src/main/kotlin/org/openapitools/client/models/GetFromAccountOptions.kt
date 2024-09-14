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
 * @param accountId
 * @param accountNo
 * @param accountType
 * @param clientId
 * @param clientName
 * @param officeId
 * @param officeName
 */

@Serializable
data class GetFromAccountOptions(

    val accountId: kotlin.Long? = null,

    val accountNo: kotlin.Int? = null,

    val accountType: GetAccountOptions? = null,

    val clientId: kotlin.Long? = null,

    val clientName: kotlin.String? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null

)

