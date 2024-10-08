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
 * @param active
 * @param approved
 * @param closed
 * @param code
 * @param description
 * @param id
 * @param rejected
 * @param submittedAndPendingApproval
 */

@Serializable
data class GetAccountsStatus(

    val active: kotlin.Boolean? = null,

    val approved: kotlin.Boolean? = null,

    val closed: kotlin.Boolean? = null,

    val code: kotlin.String? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val rejected: kotlin.Boolean? = null,

    val submittedAndPendingApproval: kotlin.Boolean? = null

)

